package com.example.memolang.szakdogadb.szakdogadb.szakdogadb.users.generated;

import com.example.memolang.szakdogadb.szakdogadb.szakdogadb.users.Users;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.function.OptionalBoolean;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.example.memolang.szakdogadb.szakdogadb.szakdogadb.users.Users}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedUsersImpl implements Users {
    
    private long id;
    private String activation;
    private String address;
    private String birthDate;
    private String email;
    private Boolean enabled;
    private String fullname;
    private String password;
    private String phoneNumber;
    private String remark;
    private String username;
    
    protected GeneratedUsersImpl() {}
    
    @Override
    public long getId() {
        return id;
    }
    
    @Override
    public Optional<String> getActivation() {
        return Optional.ofNullable(activation);
    }
    
    @Override
    public Optional<String> getAddress() {
        return Optional.ofNullable(address);
    }
    
    @Override
    public Optional<String> getBirthDate() {
        return Optional.ofNullable(birthDate);
    }
    
    @Override
    public String getEmail() {
        return email;
    }
    
    @Override
    public OptionalBoolean getEnabled() {
        return OptionalUtil.ofNullable(enabled);
    }
    
    @Override
    public Optional<String> getFullname() {
        return Optional.ofNullable(fullname);
    }
    
    @Override
    public String getPassword() {
        return password;
    }
    
    @Override
    public Optional<String> getPhoneNumber() {
        return Optional.ofNullable(phoneNumber);
    }
    
    @Override
    public Optional<String> getRemark() {
        return Optional.ofNullable(remark);
    }
    
    @Override
    public Optional<String> getUsername() {
        return Optional.ofNullable(username);
    }
    
    @Override
    public Users setId(long id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Users setActivation(String activation) {
        this.activation = activation;
        return this;
    }
    
    @Override
    public Users setAddress(String address) {
        this.address = address;
        return this;
    }
    
    @Override
    public Users setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }
    
    @Override
    public Users setEmail(String email) {
        this.email = email;
        return this;
    }
    
    @Override
    public Users setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    
    @Override
    public Users setFullname(String fullname) {
        this.fullname = fullname;
        return this;
    }
    
    @Override
    public Users setPassword(String password) {
        this.password = password;
        return this;
    }
    
    @Override
    public Users setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    
    @Override
    public Users setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    
    @Override
    public Users setUsername(String username) {
        this.username = username;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "          + Objects.toString(getId()));
        sj.add("activation = "  + Objects.toString(OptionalUtil.unwrap(getActivation())));
        sj.add("address = "     + Objects.toString(OptionalUtil.unwrap(getAddress())));
        sj.add("birthDate = "   + Objects.toString(OptionalUtil.unwrap(getBirthDate())));
        sj.add("email = "       + Objects.toString(getEmail()));
        sj.add("enabled = "     + Objects.toString(OptionalUtil.unwrap(getEnabled())));
        sj.add("fullname = "    + Objects.toString(OptionalUtil.unwrap(getFullname())));
        sj.add("password = "    + Objects.toString(getPassword()));
        sj.add("phoneNumber = " + Objects.toString(OptionalUtil.unwrap(getPhoneNumber())));
        sj.add("remark = "      + Objects.toString(OptionalUtil.unwrap(getRemark())));
        sj.add("username = "    + Objects.toString(OptionalUtil.unwrap(getUsername())));
        return "UsersImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Users)) { return false; }
        final Users thatUsers = (Users)that;
        if (this.getId() != thatUsers.getId()) { return false; }
        if (!Objects.equals(this.getActivation(), thatUsers.getActivation())) { return false; }
        if (!Objects.equals(this.getAddress(), thatUsers.getAddress())) { return false; }
        if (!Objects.equals(this.getBirthDate(), thatUsers.getBirthDate())) { return false; }
        if (!Objects.equals(this.getEmail(), thatUsers.getEmail())) { return false; }
        if (!Objects.equals(this.getEnabled(), thatUsers.getEnabled())) { return false; }
        if (!Objects.equals(this.getFullname(), thatUsers.getFullname())) { return false; }
        if (!Objects.equals(this.getPassword(), thatUsers.getPassword())) { return false; }
        if (!Objects.equals(this.getPhoneNumber(), thatUsers.getPhoneNumber())) { return false; }
        if (!Objects.equals(this.getRemark(), thatUsers.getRemark())) { return false; }
        if (!Objects.equals(this.getUsername(), thatUsers.getUsername())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Long.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getActivation()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getAddress()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getBirthDate()));
        hash = 31 * hash + Objects.hashCode(getEmail());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getEnabled()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getFullname()));
        hash = 31 * hash + Objects.hashCode(getPassword());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPhoneNumber()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getRemark()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getUsername()));
        return hash;
    }
}