/*
 * This file is generated by jOOQ.
 */
package com.hiddenswitch.framework.schema.keycloak.tables.daos;


import com.hiddenswitch.framework.schema.keycloak.tables.Realm;
import com.hiddenswitch.framework.schema.keycloak.tables.records.RealmRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;

import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.reactivepg.ReactiveClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RealmDao extends AbstractReactiveVertxDAO<RealmRecord, com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm, String, Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>>, Future<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<RealmRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm,String> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the POSTGREs types.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public RealmDao(Configuration configuration, io.vertx.sqlclient.SqlClient delegate) {
        super(Realm.REALM, com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm.class, new ReactiveClassicQueryExecutor<RealmRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm,String>(configuration,delegate,com.hiddenswitch.framework.schema.keycloak.tables.mappers.RowMappers.getRealmMapper()));
    }

    @Override
    protected String getId(com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm object) {
        return object.getId();
    }

    /**
     * Find records that have <code>access_code_lifespan IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByAccessCodeLifespan(Collection<Integer> values) {
        return findManyByCondition(Realm.REALM.ACCESS_CODE_LIFESPAN.in(values));
    }

    /**
     * Find records that have <code>access_code_lifespan IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByAccessCodeLifespan(Collection<Integer> values, int limit) {
        return findManyByCondition(Realm.REALM.ACCESS_CODE_LIFESPAN.in(values),limit);
    }

    /**
     * Find records that have <code>user_action_lifespan IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByUserActionLifespan(Collection<Integer> values) {
        return findManyByCondition(Realm.REALM.USER_ACTION_LIFESPAN.in(values));
    }

    /**
     * Find records that have <code>user_action_lifespan IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByUserActionLifespan(Collection<Integer> values, int limit) {
        return findManyByCondition(Realm.REALM.USER_ACTION_LIFESPAN.in(values),limit);
    }

    /**
     * Find records that have <code>access_token_lifespan IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByAccessTokenLifespan(Collection<Integer> values) {
        return findManyByCondition(Realm.REALM.ACCESS_TOKEN_LIFESPAN.in(values));
    }

    /**
     * Find records that have <code>access_token_lifespan IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByAccessTokenLifespan(Collection<Integer> values, int limit) {
        return findManyByCondition(Realm.REALM.ACCESS_TOKEN_LIFESPAN.in(values),limit);
    }

    /**
     * Find records that have <code>account_theme IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByAccountTheme(Collection<String> values) {
        return findManyByCondition(Realm.REALM.ACCOUNT_THEME.in(values));
    }

    /**
     * Find records that have <code>account_theme IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByAccountTheme(Collection<String> values, int limit) {
        return findManyByCondition(Realm.REALM.ACCOUNT_THEME.in(values),limit);
    }

    /**
     * Find records that have <code>admin_theme IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByAdminTheme(Collection<String> values) {
        return findManyByCondition(Realm.REALM.ADMIN_THEME.in(values));
    }

    /**
     * Find records that have <code>admin_theme IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByAdminTheme(Collection<String> values, int limit) {
        return findManyByCondition(Realm.REALM.ADMIN_THEME.in(values),limit);
    }

    /**
     * Find records that have <code>email_theme IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByEmailTheme(Collection<String> values) {
        return findManyByCondition(Realm.REALM.EMAIL_THEME.in(values));
    }

    /**
     * Find records that have <code>email_theme IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByEmailTheme(Collection<String> values, int limit) {
        return findManyByCondition(Realm.REALM.EMAIL_THEME.in(values),limit);
    }

    /**
     * Find records that have <code>enabled IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByEnabled(Collection<Boolean> values) {
        return findManyByCondition(Realm.REALM.ENABLED.in(values));
    }

    /**
     * Find records that have <code>enabled IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByEnabled(Collection<Boolean> values, int limit) {
        return findManyByCondition(Realm.REALM.ENABLED.in(values),limit);
    }

    /**
     * Find records that have <code>events_enabled IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByEventsEnabled(Collection<Boolean> values) {
        return findManyByCondition(Realm.REALM.EVENTS_ENABLED.in(values));
    }

    /**
     * Find records that have <code>events_enabled IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByEventsEnabled(Collection<Boolean> values, int limit) {
        return findManyByCondition(Realm.REALM.EVENTS_ENABLED.in(values),limit);
    }

    /**
     * Find records that have <code>events_expiration IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByEventsExpiration(Collection<Long> values) {
        return findManyByCondition(Realm.REALM.EVENTS_EXPIRATION.in(values));
    }

    /**
     * Find records that have <code>events_expiration IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByEventsExpiration(Collection<Long> values, int limit) {
        return findManyByCondition(Realm.REALM.EVENTS_EXPIRATION.in(values),limit);
    }

    /**
     * Find records that have <code>login_theme IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByLoginTheme(Collection<String> values) {
        return findManyByCondition(Realm.REALM.LOGIN_THEME.in(values));
    }

    /**
     * Find records that have <code>login_theme IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByLoginTheme(Collection<String> values, int limit) {
        return findManyByCondition(Realm.REALM.LOGIN_THEME.in(values),limit);
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByName(Collection<String> values) {
        return findManyByCondition(Realm.REALM.NAME.in(values));
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(Realm.REALM.NAME.in(values),limit);
    }

    /**
     * Find records that have <code>not_before IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByNotBefore(Collection<Integer> values) {
        return findManyByCondition(Realm.REALM.NOT_BEFORE.in(values));
    }

    /**
     * Find records that have <code>not_before IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByNotBefore(Collection<Integer> values, int limit) {
        return findManyByCondition(Realm.REALM.NOT_BEFORE.in(values),limit);
    }

    /**
     * Find records that have <code>password_policy IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByPasswordPolicy(Collection<String> values) {
        return findManyByCondition(Realm.REALM.PASSWORD_POLICY.in(values));
    }

    /**
     * Find records that have <code>password_policy IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByPasswordPolicy(Collection<String> values, int limit) {
        return findManyByCondition(Realm.REALM.PASSWORD_POLICY.in(values),limit);
    }

    /**
     * Find records that have <code>registration_allowed IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByRegistrationAllowed(Collection<Boolean> values) {
        return findManyByCondition(Realm.REALM.REGISTRATION_ALLOWED.in(values));
    }

    /**
     * Find records that have <code>registration_allowed IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByRegistrationAllowed(Collection<Boolean> values, int limit) {
        return findManyByCondition(Realm.REALM.REGISTRATION_ALLOWED.in(values),limit);
    }

    /**
     * Find records that have <code>remember_me IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByRememberMe(Collection<Boolean> values) {
        return findManyByCondition(Realm.REALM.REMEMBER_ME.in(values));
    }

    /**
     * Find records that have <code>remember_me IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByRememberMe(Collection<Boolean> values, int limit) {
        return findManyByCondition(Realm.REALM.REMEMBER_ME.in(values),limit);
    }

    /**
     * Find records that have <code>reset_password_allowed IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByResetPasswordAllowed(Collection<Boolean> values) {
        return findManyByCondition(Realm.REALM.RESET_PASSWORD_ALLOWED.in(values));
    }

    /**
     * Find records that have <code>reset_password_allowed IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByResetPasswordAllowed(Collection<Boolean> values, int limit) {
        return findManyByCondition(Realm.REALM.RESET_PASSWORD_ALLOWED.in(values),limit);
    }

    /**
     * Find records that have <code>social IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyBySocial(Collection<Boolean> values) {
        return findManyByCondition(Realm.REALM.SOCIAL.in(values));
    }

    /**
     * Find records that have <code>social IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyBySocial(Collection<Boolean> values, int limit) {
        return findManyByCondition(Realm.REALM.SOCIAL.in(values),limit);
    }

    /**
     * Find records that have <code>ssl_required IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyBySslRequired(Collection<String> values) {
        return findManyByCondition(Realm.REALM.SSL_REQUIRED.in(values));
    }

    /**
     * Find records that have <code>ssl_required IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyBySslRequired(Collection<String> values, int limit) {
        return findManyByCondition(Realm.REALM.SSL_REQUIRED.in(values),limit);
    }

    /**
     * Find records that have <code>sso_idle_timeout IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyBySsoIdleTimeout(Collection<Integer> values) {
        return findManyByCondition(Realm.REALM.SSO_IDLE_TIMEOUT.in(values));
    }

    /**
     * Find records that have <code>sso_idle_timeout IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyBySsoIdleTimeout(Collection<Integer> values, int limit) {
        return findManyByCondition(Realm.REALM.SSO_IDLE_TIMEOUT.in(values),limit);
    }

    /**
     * Find records that have <code>sso_max_lifespan IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyBySsoMaxLifespan(Collection<Integer> values) {
        return findManyByCondition(Realm.REALM.SSO_MAX_LIFESPAN.in(values));
    }

    /**
     * Find records that have <code>sso_max_lifespan IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyBySsoMaxLifespan(Collection<Integer> values, int limit) {
        return findManyByCondition(Realm.REALM.SSO_MAX_LIFESPAN.in(values),limit);
    }

    /**
     * Find records that have <code>update_profile_on_soc_login IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByUpdateProfileOnSocLogin(Collection<Boolean> values) {
        return findManyByCondition(Realm.REALM.UPDATE_PROFILE_ON_SOC_LOGIN.in(values));
    }

    /**
     * Find records that have <code>update_profile_on_soc_login IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByUpdateProfileOnSocLogin(Collection<Boolean> values, int limit) {
        return findManyByCondition(Realm.REALM.UPDATE_PROFILE_ON_SOC_LOGIN.in(values),limit);
    }

    /**
     * Find records that have <code>verify_email IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByVerifyEmail(Collection<Boolean> values) {
        return findManyByCondition(Realm.REALM.VERIFY_EMAIL.in(values));
    }

    /**
     * Find records that have <code>verify_email IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByVerifyEmail(Collection<Boolean> values, int limit) {
        return findManyByCondition(Realm.REALM.VERIFY_EMAIL.in(values),limit);
    }

    /**
     * Find records that have <code>master_admin_client IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByMasterAdminClient(Collection<String> values) {
        return findManyByCondition(Realm.REALM.MASTER_ADMIN_CLIENT.in(values));
    }

    /**
     * Find records that have <code>master_admin_client IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByMasterAdminClient(Collection<String> values, int limit) {
        return findManyByCondition(Realm.REALM.MASTER_ADMIN_CLIENT.in(values),limit);
    }

    /**
     * Find records that have <code>login_lifespan IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByLoginLifespan(Collection<Integer> values) {
        return findManyByCondition(Realm.REALM.LOGIN_LIFESPAN.in(values));
    }

    /**
     * Find records that have <code>login_lifespan IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByLoginLifespan(Collection<Integer> values, int limit) {
        return findManyByCondition(Realm.REALM.LOGIN_LIFESPAN.in(values),limit);
    }

    /**
     * Find records that have <code>internationalization_enabled IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByInternationalizationEnabled(Collection<Boolean> values) {
        return findManyByCondition(Realm.REALM.INTERNATIONALIZATION_ENABLED.in(values));
    }

    /**
     * Find records that have <code>internationalization_enabled IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByInternationalizationEnabled(Collection<Boolean> values, int limit) {
        return findManyByCondition(Realm.REALM.INTERNATIONALIZATION_ENABLED.in(values),limit);
    }

    /**
     * Find records that have <code>default_locale IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByDefaultLocale(Collection<String> values) {
        return findManyByCondition(Realm.REALM.DEFAULT_LOCALE.in(values));
    }

    /**
     * Find records that have <code>default_locale IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByDefaultLocale(Collection<String> values, int limit) {
        return findManyByCondition(Realm.REALM.DEFAULT_LOCALE.in(values),limit);
    }

    /**
     * Find records that have <code>reg_email_as_username IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByRegEmailAsUsername(Collection<Boolean> values) {
        return findManyByCondition(Realm.REALM.REG_EMAIL_AS_USERNAME.in(values));
    }

    /**
     * Find records that have <code>reg_email_as_username IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByRegEmailAsUsername(Collection<Boolean> values, int limit) {
        return findManyByCondition(Realm.REALM.REG_EMAIL_AS_USERNAME.in(values),limit);
    }

    /**
     * Find records that have <code>admin_events_enabled IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByAdminEventsEnabled(Collection<Boolean> values) {
        return findManyByCondition(Realm.REALM.ADMIN_EVENTS_ENABLED.in(values));
    }

    /**
     * Find records that have <code>admin_events_enabled IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByAdminEventsEnabled(Collection<Boolean> values, int limit) {
        return findManyByCondition(Realm.REALM.ADMIN_EVENTS_ENABLED.in(values),limit);
    }

    /**
     * Find records that have <code>admin_events_details_enabled IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByAdminEventsDetailsEnabled(Collection<Boolean> values) {
        return findManyByCondition(Realm.REALM.ADMIN_EVENTS_DETAILS_ENABLED.in(values));
    }

    /**
     * Find records that have <code>admin_events_details_enabled IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByAdminEventsDetailsEnabled(Collection<Boolean> values, int limit) {
        return findManyByCondition(Realm.REALM.ADMIN_EVENTS_DETAILS_ENABLED.in(values),limit);
    }

    /**
     * Find records that have <code>edit_username_allowed IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByEditUsernameAllowed(Collection<Boolean> values) {
        return findManyByCondition(Realm.REALM.EDIT_USERNAME_ALLOWED.in(values));
    }

    /**
     * Find records that have <code>edit_username_allowed IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByEditUsernameAllowed(Collection<Boolean> values, int limit) {
        return findManyByCondition(Realm.REALM.EDIT_USERNAME_ALLOWED.in(values),limit);
    }

    /**
     * Find records that have <code>otp_policy_counter IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByOtpPolicyCounter(Collection<Integer> values) {
        return findManyByCondition(Realm.REALM.OTP_POLICY_COUNTER.in(values));
    }

    /**
     * Find records that have <code>otp_policy_counter IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByOtpPolicyCounter(Collection<Integer> values, int limit) {
        return findManyByCondition(Realm.REALM.OTP_POLICY_COUNTER.in(values),limit);
    }

    /**
     * Find records that have <code>otp_policy_window IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByOtpPolicyWindow(Collection<Integer> values) {
        return findManyByCondition(Realm.REALM.OTP_POLICY_WINDOW.in(values));
    }

    /**
     * Find records that have <code>otp_policy_window IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByOtpPolicyWindow(Collection<Integer> values, int limit) {
        return findManyByCondition(Realm.REALM.OTP_POLICY_WINDOW.in(values),limit);
    }

    /**
     * Find records that have <code>otp_policy_period IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByOtpPolicyPeriod(Collection<Integer> values) {
        return findManyByCondition(Realm.REALM.OTP_POLICY_PERIOD.in(values));
    }

    /**
     * Find records that have <code>otp_policy_period IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByOtpPolicyPeriod(Collection<Integer> values, int limit) {
        return findManyByCondition(Realm.REALM.OTP_POLICY_PERIOD.in(values),limit);
    }

    /**
     * Find records that have <code>otp_policy_digits IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByOtpPolicyDigits(Collection<Integer> values) {
        return findManyByCondition(Realm.REALM.OTP_POLICY_DIGITS.in(values));
    }

    /**
     * Find records that have <code>otp_policy_digits IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByOtpPolicyDigits(Collection<Integer> values, int limit) {
        return findManyByCondition(Realm.REALM.OTP_POLICY_DIGITS.in(values),limit);
    }

    /**
     * Find records that have <code>otp_policy_alg IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByOtpPolicyAlg(Collection<String> values) {
        return findManyByCondition(Realm.REALM.OTP_POLICY_ALG.in(values));
    }

    /**
     * Find records that have <code>otp_policy_alg IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByOtpPolicyAlg(Collection<String> values, int limit) {
        return findManyByCondition(Realm.REALM.OTP_POLICY_ALG.in(values),limit);
    }

    /**
     * Find records that have <code>otp_policy_type IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByOtpPolicyType(Collection<String> values) {
        return findManyByCondition(Realm.REALM.OTP_POLICY_TYPE.in(values));
    }

    /**
     * Find records that have <code>otp_policy_type IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByOtpPolicyType(Collection<String> values, int limit) {
        return findManyByCondition(Realm.REALM.OTP_POLICY_TYPE.in(values),limit);
    }

    /**
     * Find records that have <code>browser_flow IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByBrowserFlow(Collection<String> values) {
        return findManyByCondition(Realm.REALM.BROWSER_FLOW.in(values));
    }

    /**
     * Find records that have <code>browser_flow IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByBrowserFlow(Collection<String> values, int limit) {
        return findManyByCondition(Realm.REALM.BROWSER_FLOW.in(values),limit);
    }

    /**
     * Find records that have <code>registration_flow IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByRegistrationFlow(Collection<String> values) {
        return findManyByCondition(Realm.REALM.REGISTRATION_FLOW.in(values));
    }

    /**
     * Find records that have <code>registration_flow IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByRegistrationFlow(Collection<String> values, int limit) {
        return findManyByCondition(Realm.REALM.REGISTRATION_FLOW.in(values),limit);
    }

    /**
     * Find records that have <code>direct_grant_flow IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByDirectGrantFlow(Collection<String> values) {
        return findManyByCondition(Realm.REALM.DIRECT_GRANT_FLOW.in(values));
    }

    /**
     * Find records that have <code>direct_grant_flow IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByDirectGrantFlow(Collection<String> values, int limit) {
        return findManyByCondition(Realm.REALM.DIRECT_GRANT_FLOW.in(values),limit);
    }

    /**
     * Find records that have <code>reset_credentials_flow IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByResetCredentialsFlow(Collection<String> values) {
        return findManyByCondition(Realm.REALM.RESET_CREDENTIALS_FLOW.in(values));
    }

    /**
     * Find records that have <code>reset_credentials_flow IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByResetCredentialsFlow(Collection<String> values, int limit) {
        return findManyByCondition(Realm.REALM.RESET_CREDENTIALS_FLOW.in(values),limit);
    }

    /**
     * Find records that have <code>client_auth_flow IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByClientAuthFlow(Collection<String> values) {
        return findManyByCondition(Realm.REALM.CLIENT_AUTH_FLOW.in(values));
    }

    /**
     * Find records that have <code>client_auth_flow IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByClientAuthFlow(Collection<String> values, int limit) {
        return findManyByCondition(Realm.REALM.CLIENT_AUTH_FLOW.in(values),limit);
    }

    /**
     * Find records that have <code>offline_session_idle_timeout IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByOfflineSessionIdleTimeout(Collection<Integer> values) {
        return findManyByCondition(Realm.REALM.OFFLINE_SESSION_IDLE_TIMEOUT.in(values));
    }

    /**
     * Find records that have <code>offline_session_idle_timeout IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByOfflineSessionIdleTimeout(Collection<Integer> values, int limit) {
        return findManyByCondition(Realm.REALM.OFFLINE_SESSION_IDLE_TIMEOUT.in(values),limit);
    }

    /**
     * Find records that have <code>revoke_refresh_token IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByRevokeRefreshToken(Collection<Boolean> values) {
        return findManyByCondition(Realm.REALM.REVOKE_REFRESH_TOKEN.in(values));
    }

    /**
     * Find records that have <code>revoke_refresh_token IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByRevokeRefreshToken(Collection<Boolean> values, int limit) {
        return findManyByCondition(Realm.REALM.REVOKE_REFRESH_TOKEN.in(values),limit);
    }

    /**
     * Find records that have <code>access_token_life_implicit IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByAccessTokenLifeImplicit(Collection<Integer> values) {
        return findManyByCondition(Realm.REALM.ACCESS_TOKEN_LIFE_IMPLICIT.in(values));
    }

    /**
     * Find records that have <code>access_token_life_implicit IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByAccessTokenLifeImplicit(Collection<Integer> values, int limit) {
        return findManyByCondition(Realm.REALM.ACCESS_TOKEN_LIFE_IMPLICIT.in(values),limit);
    }

    /**
     * Find records that have <code>login_with_email_allowed IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByLoginWithEmailAllowed(Collection<Boolean> values) {
        return findManyByCondition(Realm.REALM.LOGIN_WITH_EMAIL_ALLOWED.in(values));
    }

    /**
     * Find records that have <code>login_with_email_allowed IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByLoginWithEmailAllowed(Collection<Boolean> values, int limit) {
        return findManyByCondition(Realm.REALM.LOGIN_WITH_EMAIL_ALLOWED.in(values),limit);
    }

    /**
     * Find records that have <code>duplicate_emails_allowed IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByDuplicateEmailsAllowed(Collection<Boolean> values) {
        return findManyByCondition(Realm.REALM.DUPLICATE_EMAILS_ALLOWED.in(values));
    }

    /**
     * Find records that have <code>duplicate_emails_allowed IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByDuplicateEmailsAllowed(Collection<Boolean> values, int limit) {
        return findManyByCondition(Realm.REALM.DUPLICATE_EMAILS_ALLOWED.in(values),limit);
    }

    /**
     * Find records that have <code>docker_auth_flow IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByDockerAuthFlow(Collection<String> values) {
        return findManyByCondition(Realm.REALM.DOCKER_AUTH_FLOW.in(values));
    }

    /**
     * Find records that have <code>docker_auth_flow IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByDockerAuthFlow(Collection<String> values, int limit) {
        return findManyByCondition(Realm.REALM.DOCKER_AUTH_FLOW.in(values),limit);
    }

    /**
     * Find records that have <code>refresh_token_max_reuse IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByRefreshTokenMaxReuse(Collection<Integer> values) {
        return findManyByCondition(Realm.REALM.REFRESH_TOKEN_MAX_REUSE.in(values));
    }

    /**
     * Find records that have <code>refresh_token_max_reuse IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByRefreshTokenMaxReuse(Collection<Integer> values, int limit) {
        return findManyByCondition(Realm.REALM.REFRESH_TOKEN_MAX_REUSE.in(values),limit);
    }

    /**
     * Find records that have <code>allow_user_managed_access IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByAllowUserManagedAccess(Collection<Boolean> values) {
        return findManyByCondition(Realm.REALM.ALLOW_USER_MANAGED_ACCESS.in(values));
    }

    /**
     * Find records that have <code>allow_user_managed_access IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyByAllowUserManagedAccess(Collection<Boolean> values, int limit) {
        return findManyByCondition(Realm.REALM.ALLOW_USER_MANAGED_ACCESS.in(values),limit);
    }

    /**
     * Find records that have <code>sso_max_lifespan_remember_me IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyBySsoMaxLifespanRememberMe(Collection<Integer> values) {
        return findManyByCondition(Realm.REALM.SSO_MAX_LIFESPAN_REMEMBER_ME.in(values));
    }

    /**
     * Find records that have <code>sso_max_lifespan_remember_me IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyBySsoMaxLifespanRememberMe(Collection<Integer> values, int limit) {
        return findManyByCondition(Realm.REALM.SSO_MAX_LIFESPAN_REMEMBER_ME.in(values),limit);
    }

    /**
     * Find records that have <code>sso_idle_timeout_remember_me IN (values)</code> asynchronously
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyBySsoIdleTimeoutRememberMe(Collection<Integer> values) {
        return findManyByCondition(Realm.REALM.SSO_IDLE_TIMEOUT_REMEMBER_ME.in(values));
    }

    /**
     * Find records that have <code>sso_idle_timeout_remember_me IN (values)</code> asynchronously limited by the given limit
     */
    public Future<List<com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm>> findManyBySsoIdleTimeoutRememberMe(Collection<Integer> values, int limit) {
        return findManyByCondition(Realm.REALM.SSO_IDLE_TIMEOUT_REMEMBER_ME.in(values),limit);
    }

    @Override
    public ReactiveClassicQueryExecutor<RealmRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm,String> queryExecutor(){
        return (ReactiveClassicQueryExecutor<RealmRecord,com.hiddenswitch.framework.schema.keycloak.tables.pojos.Realm,String>) super.queryExecutor();
    }
}