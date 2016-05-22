package hu.bme.onlab.user.bean;

import java.util.Map;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

@BeanDefinition
public class SignupRequest implements Bean {

	@PropertyDefinition(validate = "notEmpty")
	private String email;
	
	@PropertyDefinition(validate = "notEmpty")
	private String password;

	//------------------------- AUTOGENERATED START -------------------------
	///CLOVER:OFF
	/**
	 * The meta-bean for {@code SignupRequest}.
	 * @return the meta-bean, not null
	 */
	public static SignupRequest.Meta meta() {
		return SignupRequest.Meta.INSTANCE;
	}

	static {
		JodaBeanUtils.registerMetaBean(SignupRequest.Meta.INSTANCE);
	}

	@Override
	public SignupRequest.Meta metaBean() {
		return SignupRequest.Meta.INSTANCE;
	}

	@Override
	public <R> Property<R> property(String propertyName) {
		return metaBean().<R>metaProperty(propertyName).createProperty(this);
	}

	@Override
	public Set<String> propertyNames() {
		return metaBean().metaPropertyMap().keySet();
	}

	//-----------------------------------------------------------------------
	/**
	 * Gets the email.
	 * @return the value of the property, not empty
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 * @param email  the new value of the property, not empty
	 */
	public void setEmail(String email) {
		JodaBeanUtils.notEmpty(email, "email");
		this.email = email;
	}

	/**
	 * Gets the the {@code email} property.
	 * @return the property, not null
	 */
	public final Property<String> email() {
		return metaBean().email().createProperty(this);
	}

	//-----------------------------------------------------------------------
	/**
	 * Gets the password.
	 * @return the value of the property, not empty
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 * @param password  the new value of the property, not empty
	 */
	public void setPassword(String password) {
		JodaBeanUtils.notEmpty(password, "password");
		this.password = password;
	}

	/**
	 * Gets the the {@code password} property.
	 * @return the property, not null
	 */
	public final Property<String> password() {
		return metaBean().password().createProperty(this);
	}

	//-----------------------------------------------------------------------
	@Override
	public SignupRequest clone() {
		return JodaBeanUtils.cloneAlways(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj != null && obj.getClass() == this.getClass()) {
			SignupRequest other = (SignupRequest) obj;
			return JodaBeanUtils.equal(getEmail(), other.getEmail()) &&
					JodaBeanUtils.equal(getPassword(), other.getPassword());
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = getClass().hashCode();
		hash = hash * 31 + JodaBeanUtils.hashCode(getEmail());
		hash = hash * 31 + JodaBeanUtils.hashCode(getPassword());
		return hash;
	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder(96);
		buf.append("SignupRequest{");
		int len = buf.length();
		toString(buf);
		if (buf.length() > len) {
			buf.setLength(buf.length() - 2);
		}
		buf.append('}');
		return buf.toString();
	}

	protected void toString(StringBuilder buf) {
		buf.append("email").append('=').append(JodaBeanUtils.toString(getEmail())).append(',').append(' ');
		buf.append("password").append('=').append(JodaBeanUtils.toString(getPassword())).append(',').append(' ');
	}

	//-----------------------------------------------------------------------
	/**
	 * The meta-bean for {@code SignupRequest}.
	 */
	public static class Meta extends DirectMetaBean {
		/**
		 * The singleton instance of the meta-bean.
		 */
		static final Meta INSTANCE = new Meta();

		/**
		 * The meta-property for the {@code email} property.
		 */
		private final MetaProperty<String> email = DirectMetaProperty.ofReadWrite(
				this, "email", SignupRequest.class, String.class);
		/**
		 * The meta-property for the {@code password} property.
		 */
		private final MetaProperty<String> password = DirectMetaProperty.ofReadWrite(
				this, "password", SignupRequest.class, String.class);
		/**
		 * The meta-properties.
		 */
		private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
				this, null,
				"email",
				"password");

		/**
		 * Restricted constructor.
		 */
		protected Meta() {
		}

		@Override
		protected MetaProperty<?> metaPropertyGet(String propertyName) {
			switch (propertyName.hashCode()) {
				case 96619420:  // email
					return email;
				case 1216985755:  // password
					return password;
			}
			return super.metaPropertyGet(propertyName);
		}

		@Override
		public BeanBuilder<? extends SignupRequest> builder() {
			return new DirectBeanBuilder<SignupRequest>(new SignupRequest());
		}

		@Override
		public Class<? extends SignupRequest> beanType() {
			return SignupRequest.class;
		}

		@Override
		public Map<String, MetaProperty<?>> metaPropertyMap() {
			return metaPropertyMap$;
		}

		//-----------------------------------------------------------------------
		/**
		 * The meta-property for the {@code email} property.
		 * @return the meta-property, not null
		 */
		public final MetaProperty<String> email() {
			return email;
		}

		/**
		 * The meta-property for the {@code password} property.
		 * @return the meta-property, not null
		 */
		public final MetaProperty<String> password() {
			return password;
		}

		//-----------------------------------------------------------------------
		@Override
		protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
			switch (propertyName.hashCode()) {
				case 96619420:  // email
					return ((SignupRequest) bean).getEmail();
				case 1216985755:  // password
					return ((SignupRequest) bean).getPassword();
			}
			return super.propertyGet(bean, propertyName, quiet);
		}

		@Override
		protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
			switch (propertyName.hashCode()) {
				case 96619420:  // email
					((SignupRequest) bean).setEmail((String) newValue);
					return;
				case 1216985755:  // password
					((SignupRequest) bean).setPassword((String) newValue);
					return;
			}
			super.propertySet(bean, propertyName, newValue, quiet);
		}

		@Override
		protected void validate(Bean bean) {
			JodaBeanUtils.notEmpty(((SignupRequest) bean).email, "email");
			JodaBeanUtils.notEmpty(((SignupRequest) bean).password, "password");
		}

	}

	///CLOVER:ON
	//-------------------------- AUTOGENERATED END --------------------------
}