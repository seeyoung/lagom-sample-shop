package command;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import model.Product;

/**
 * Immutable implementation of {@link ProductCommand.AbstractCreateProductCommand}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code CreateProductCommand.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code CreateProductCommand.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ProductCommand.AbstractCreateProductCommand"})
@Immutable
public final class CreateProductCommand implements ProductCommand.AbstractCreateProductCommand {
  private final Product product;

  private CreateProductCommand(Product product) {
    this.product = Preconditions.checkNotNull(product, "product");
  }

  private CreateProductCommand(CreateProductCommand original, Product product) {
    this.product = product;
  }

  /**
   * @return The value of the {@code product} attribute
   */
  @Override
  public Product product() {
    return product;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ProductCommand.AbstractCreateProductCommand#product() product} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for product
   * @return A modified copy of the {@code this} object
   */
  public final CreateProductCommand withProduct(Product value) {
    if (this.product == value) return this;
    Product newValue = Preconditions.checkNotNull(value, "product");
    return new CreateProductCommand(this, newValue);
  }

  /**
   * This instance is equal to all instances of {@code CreateProductCommand} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof CreateProductCommand
        && equalTo((CreateProductCommand) another);
  }

  private boolean equalTo(CreateProductCommand another) {
    return product.equals(another.product);
  }

  /**
   * Computes a hash code from attributes: {@code product}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + product.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CreateProductCommand} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("CreateProductCommand")
        .omitNullValues()
        .add("product", product)
        .toString();
  }

  /**
   * Construct a new immutable {@code CreateProductCommand} instance.
   * @param product The value for the {@code product} attribute
   * @return An immutable CreateProductCommand instance
   */
  public static CreateProductCommand of(Product product) {
    return new CreateProductCommand(product);
  }

  /**
   * Creates an immutable copy of a {@link ProductCommand.AbstractCreateProductCommand} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CreateProductCommand instance
   */
  public static CreateProductCommand copyOf(ProductCommand.AbstractCreateProductCommand instance) {
    if (instance instanceof CreateProductCommand) {
      return (CreateProductCommand) instance;
    }
    return CreateProductCommand.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link CreateProductCommand CreateProductCommand}.
   * @return A new CreateProductCommand builder
   */
  public static CreateProductCommand.Builder builder() {
    return new CreateProductCommand.Builder();
  }

  /**
   * Builds instances of type {@link CreateProductCommand CreateProductCommand}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_PRODUCT = 0x1L;
    private long initBits = 0x1L;

    private @Nullable Product product;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AbstractCreateProductCommand} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ProductCommand.AbstractCreateProductCommand instance) {
      Preconditions.checkNotNull(instance, "instance");
      product(instance.product());
      return this;
    }

    /**
     * Initializes the value for the {@link ProductCommand.AbstractCreateProductCommand#product() product} attribute.
     * @param product The value for product 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder product(Product product) {
      this.product = Preconditions.checkNotNull(product, "product");
      initBits &= ~INIT_BIT_PRODUCT;
      return this;
    }

    /**
     * Builds a new {@link CreateProductCommand CreateProductCommand}.
     * @return An immutable instance of CreateProductCommand
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CreateProductCommand build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new CreateProductCommand(null, product);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_PRODUCT) != 0) attributes.add("product");
      return "Cannot build CreateProductCommand, some of required attributes are not set " + attributes;
    }
  }
}
