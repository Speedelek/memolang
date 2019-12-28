package com.example.memolang.szakdogadb.szakdogadb.szakdogadb.users.generated;

import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.users.Users;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.function.OptionalBoolean;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.LongField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.util.Optional;

/**
 * The generated base for the {@link
 * com.example.memolang.szakdogadb.szakdogadb.szakdogadb.users.Users}-interface
 * representing entities of the {@code users}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedUsers {
    
    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getId()} method.
     */
    LongField<Users, Long> ID = LongField.create(
        Identifier.ID,
        Users::getId,
        Users::setId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getActivation()} method.
     */
    StringField<Users, String> ACTIVATION = StringField.create(
        Identifier.ACTIVATION,
        o -> OptionalUtil.unwrap(o.getActivation()),
        Users::setActivation,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getAddress()} method.
     */
    StringField<Users, String> ADDRESS = StringField.create(
        Identifier.ADDRESS,
        o -> OptionalUtil.unwrap(o.getAddress()),
        Users::setAddress,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getBirthDate()} method.
     */
    StringField<Users, String> BIRTH_DATE = StringField.create(
        Identifier.BIRTH_DATE,
        o -> OptionalUtil.unwrap(o.getBirthDate()),
        Users::setBirthDate,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getEmail()} method.
     */
    StringField<Users, String> EMAIL = StringField.create(
        Identifier.EMAIL,
        Users::getEmail,
        Users::setEmail,
        TypeMapper.identity(),
        true
    );
    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getEnabled()} method.
     */
    ComparableField<Users, Boolean, Boolean> ENABLED = ComparableField.create(
        Identifier.ENABLED,
        o -> OptionalUtil.unwrap(o.getEnabled()),
        Users::setEnabled,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getFullname()} method.
     */
    StringField<Users, String> FULLNAME = StringField.create(
        Identifier.FULLNAME,
        o -> OptionalUtil.unwrap(o.getFullname()),
        Users::setFullname,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getPassword()} method.
     */
    StringField<Users, String> PASSWORD = StringField.create(
        Identifier.PASSWORD,
        Users::getPassword,
        Users::setPassword,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getPhoneNumber()} method.
     */
    StringField<Users, String> PHONE_NUMBER = StringField.create(
        Identifier.PHONE_NUMBER,
        o -> OptionalUtil.unwrap(o.getPhoneNumber()),
        Users::setPhoneNumber,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getRemark()} method.
     */
    StringField<Users, String> REMARK = StringField.create(
        Identifier.REMARK,
        o -> OptionalUtil.unwrap(o.getRemark()),
        Users::setRemark,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getUsername()} method.
     */
    StringField<Users, String> USERNAME = StringField.create(
        Identifier.USERNAME,
        o -> OptionalUtil.unwrap(o.getUsername()),
        Users::setUsername,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this Users. The id field corresponds to the database
     * column szakdogadb.szakdogadb.users.id.
     * 
     * @return the id of this Users
     */
    long getId();
    
    /**
     * Returns the activation of this Users. The activation field corresponds to
     * the database column szakdogadb.szakdogadb.users.activation.
     * 
     * @return the activation of this Users
     */
    Optional<String> getActivation();
    
    /**
     * Returns the address of this Users. The address field corresponds to the
     * database column szakdogadb.szakdogadb.users.address.
     * 
     * @return the address of this Users
     */
    Optional<String> getAddress();
    
    /**
     * Returns the birthDate of this Users. The birthDate field corresponds to
     * the database column szakdogadb.szakdogadb.users.birth_date.
     * 
     * @return the birthDate of this Users
     */
    Optional<String> getBirthDate();
    
    /**
     * Returns the email of this Users. The email field corresponds to the
     * database column szakdogadb.szakdogadb.users.email.
     * 
     * @return the email of this Users
     */
    String getEmail();
    
    /**
     * Returns the enabled of this Users. The enabled field corresponds to the
     * database column szakdogadb.szakdogadb.users.enabled.
     * 
     * @return the enabled of this Users
     */
    OptionalBoolean getEnabled();
    
    /**
     * Returns the fullname of this Users. The fullname field corresponds to the
     * database column szakdogadb.szakdogadb.users.fullname.
     * 
     * @return the fullname of this Users
     */
    Optional<String> getFullname();
    
    /**
     * Returns the password of this Users. The password field corresponds to the
     * database column szakdogadb.szakdogadb.users.password.
     * 
     * @return the password of this Users
     */
    String getPassword();
    
    /**
     * Returns the phoneNumber of this Users. The phoneNumber field corresponds
     * to the database column szakdogadb.szakdogadb.users.phone_number.
     * 
     * @return the phoneNumber of this Users
     */
    Optional<String> getPhoneNumber();
    
    /**
     * Returns the remark of this Users. The remark field corresponds to the
     * database column szakdogadb.szakdogadb.users.remark.
     * 
     * @return the remark of this Users
     */
    Optional<String> getRemark();
    
    /**
     * Returns the username of this Users. The username field corresponds to the
     * database column szakdogadb.szakdogadb.users.username.
     * 
     * @return the username of this Users
     */
    Optional<String> getUsername();
    
    /**
     * Sets the id of this Users. The id field corresponds to the database
     * column szakdogadb.szakdogadb.users.id.
     * 
     * @param id to set of this Users
     * @return   this Users instance
     */
    Users setId(long id);
    
    /**
     * Sets the activation of this Users. The activation field corresponds to
     * the database column szakdogadb.szakdogadb.users.activation.
     * 
     * @param activation to set of this Users
     * @return           this Users instance
     */
    Users setActivation(String activation);
    
    /**
     * Sets the address of this Users. The address field corresponds to the
     * database column szakdogadb.szakdogadb.users.address.
     * 
     * @param address to set of this Users
     * @return        this Users instance
     */
    Users setAddress(String address);
    
    /**
     * Sets the birthDate of this Users. The birthDate field corresponds to the
     * database column szakdogadb.szakdogadb.users.birth_date.
     * 
     * @param birthDate to set of this Users
     * @return          this Users instance
     */
    Users setBirthDate(String birthDate);
    
    /**
     * Sets the email of this Users. The email field corresponds to the database
     * column szakdogadb.szakdogadb.users.email.
     * 
     * @param email to set of this Users
     * @return      this Users instance
     */
    Users setEmail(String email);
    
    /**
     * Sets the enabled of this Users. The enabled field corresponds to the
     * database column szakdogadb.szakdogadb.users.enabled.
     * 
     * @param enabled to set of this Users
     * @return        this Users instance
     */
    Users setEnabled(Boolean enabled);
    
    /**
     * Sets the fullname of this Users. The fullname field corresponds to the
     * database column szakdogadb.szakdogadb.users.fullname.
     * 
     * @param fullname to set of this Users
     * @return         this Users instance
     */
    Users setFullname(String fullname);
    
    /**
     * Sets the password of this Users. The password field corresponds to the
     * database column szakdogadb.szakdogadb.users.password.
     * 
     * @param password to set of this Users
     * @return         this Users instance
     */
    Users setPassword(String password);
    
    /**
     * Sets the phoneNumber of this Users. The phoneNumber field corresponds to
     * the database column szakdogadb.szakdogadb.users.phone_number.
     * 
     * @param phoneNumber to set of this Users
     * @return            this Users instance
     */
    Users setPhoneNumber(String phoneNumber);
    
    /**
     * Sets the remark of this Users. The remark field corresponds to the
     * database column szakdogadb.szakdogadb.users.remark.
     * 
     * @param remark to set of this Users
     * @return       this Users instance
     */
    Users setRemark(String remark);
    
    /**
     * Sets the username of this Users. The username field corresponds to the
     * database column szakdogadb.szakdogadb.users.username.
     * 
     * @param username to set of this Users
     * @return         this Users instance
     */
    Users setUsername(String username);
    
    enum Identifier implements ColumnIdentifier<Users> {
        
        ID           ("id"),
        ACTIVATION   ("activation"),
        ADDRESS      ("address"),
        BIRTH_DATE   ("birth_date"),
        EMAIL        ("email"),
        ENABLED      ("enabled"),
        FULLNAME     ("fullname"),
        PASSWORD     ("password"),
        PHONE_NUMBER ("phone_number"),
        REMARK       ("remark"),
        USERNAME     ("username");
        
        private final String columnId;
        private final TableIdentifier<Users> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "szakdogadb";
        }
        
        @Override
        public String getSchemaId() {
            return "szakdogadb";
        }
        
        @Override
        public String getTableId() {
            return "users";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<Users> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}