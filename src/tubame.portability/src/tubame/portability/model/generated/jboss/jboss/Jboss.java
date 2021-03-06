//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.17 at 10:51:38 AM JST 
//

package tubame.portability.model.generated.jboss.jboss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "loaderRepository", "jmxName",
        "enforceEjbRestrictions", "securityDomain",
        "missingMethodPermissionsExcludedMode", "unauthenticatedPrincipal",
        "exceptionOnRollback", "webservices", "enterpriseBeans",
        "assemblyDescriptor", "resourceManagers", "invokerProxyBindings",
        "containerConfigurations" })
@XmlRootElement(name = "jboss")
public class Jboss {

    @XmlElement(name = "loader-repository")
    protected LoaderRepository loaderRepository;
    @XmlElement(name = "jmx-name")
    protected String jmxName;
    @XmlElement(name = "enforce-ejb-restrictions")
    protected String enforceEjbRestrictions;
    @XmlElement(name = "security-domain")
    protected String securityDomain;
    @XmlElement(name = "missing-method-permissions-excluded-mode")
    protected String missingMethodPermissionsExcludedMode;
    @XmlElement(name = "unauthenticated-principal")
    protected String unauthenticatedPrincipal;
    @XmlElement(name = "exception-on-rollback")
    protected String exceptionOnRollback;
    protected Webservices webservices;
    @XmlElement(name = "enterprise-beans")
    protected EnterpriseBeans enterpriseBeans;
    @XmlElement(name = "assembly-descriptor")
    protected AssemblyDescriptor assemblyDescriptor;
    @XmlElement(name = "resource-managers")
    protected ResourceManagers resourceManagers;
    @XmlElement(name = "invoker-proxy-bindings")
    protected InvokerProxyBindings invokerProxyBindings;
    @XmlElement(name = "container-configurations")
    protected ContainerConfigurations containerConfigurations;

    /**
     * Gets the value of the loaderRepository property.
     * 
     * @return possible object is {@link LoaderRepository }
     * 
     */
    public LoaderRepository getLoaderRepository() {
        return loaderRepository;
    }

    /**
     * Sets the value of the loaderRepository property.
     * 
     * @param value
     *            allowed object is {@link LoaderRepository }
     * 
     */
    public void setLoaderRepository(LoaderRepository value) {
        this.loaderRepository = value;
    }

    /**
     * Gets the value of the jmxName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getJmxName() {
        return jmxName;
    }

    /**
     * Sets the value of the jmxName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setJmxName(String value) {
        this.jmxName = value;
    }

    /**
     * Gets the value of the enforceEjbRestrictions property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEnforceEjbRestrictions() {
        return enforceEjbRestrictions;
    }

    /**
     * Sets the value of the enforceEjbRestrictions property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setEnforceEjbRestrictions(String value) {
        this.enforceEjbRestrictions = value;
    }

    /**
     * Gets the value of the securityDomain property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSecurityDomain() {
        return securityDomain;
    }

    /**
     * Sets the value of the securityDomain property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSecurityDomain(String value) {
        this.securityDomain = value;
    }

    /**
     * Gets the value of the missingMethodPermissionsExcludedMode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMissingMethodPermissionsExcludedMode() {
        return missingMethodPermissionsExcludedMode;
    }

    /**
     * Sets the value of the missingMethodPermissionsExcludedMode property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMissingMethodPermissionsExcludedMode(String value) {
        this.missingMethodPermissionsExcludedMode = value;
    }

    /**
     * Gets the value of the unauthenticatedPrincipal property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getUnauthenticatedPrincipal() {
        return unauthenticatedPrincipal;
    }

    /**
     * Sets the value of the unauthenticatedPrincipal property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setUnauthenticatedPrincipal(String value) {
        this.unauthenticatedPrincipal = value;
    }

    /**
     * Gets the value of the exceptionOnRollback property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getExceptionOnRollback() {
        return exceptionOnRollback;
    }

    /**
     * Sets the value of the exceptionOnRollback property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setExceptionOnRollback(String value) {
        this.exceptionOnRollback = value;
    }

    /**
     * Gets the value of the webservices property.
     * 
     * @return possible object is {@link Webservices }
     * 
     */
    public Webservices getWebservices() {
        return webservices;
    }

    /**
     * Sets the value of the webservices property.
     * 
     * @param value
     *            allowed object is {@link Webservices }
     * 
     */
    public void setWebservices(Webservices value) {
        this.webservices = value;
    }

    /**
     * Gets the value of the enterpriseBeans property.
     * 
     * @return possible object is {@link EnterpriseBeans }
     * 
     */
    public EnterpriseBeans getEnterpriseBeans() {
        return enterpriseBeans;
    }

    /**
     * Sets the value of the enterpriseBeans property.
     * 
     * @param value
     *            allowed object is {@link EnterpriseBeans }
     * 
     */
    public void setEnterpriseBeans(EnterpriseBeans value) {
        this.enterpriseBeans = value;
    }

    /**
     * Gets the value of the assemblyDescriptor property.
     * 
     * @return possible object is {@link AssemblyDescriptor }
     * 
     */
    public AssemblyDescriptor getAssemblyDescriptor() {
        return assemblyDescriptor;
    }

    /**
     * Sets the value of the assemblyDescriptor property.
     * 
     * @param value
     *            allowed object is {@link AssemblyDescriptor }
     * 
     */
    public void setAssemblyDescriptor(AssemblyDescriptor value) {
        this.assemblyDescriptor = value;
    }

    /**
     * Gets the value of the resourceManagers property.
     * 
     * @return possible object is {@link ResourceManagers }
     * 
     */
    public ResourceManagers getResourceManagers() {
        return resourceManagers;
    }

    /**
     * Sets the value of the resourceManagers property.
     * 
     * @param value
     *            allowed object is {@link ResourceManagers }
     * 
     */
    public void setResourceManagers(ResourceManagers value) {
        this.resourceManagers = value;
    }

    /**
     * Gets the value of the invokerProxyBindings property.
     * 
     * @return possible object is {@link InvokerProxyBindings }
     * 
     */
    public InvokerProxyBindings getInvokerProxyBindings() {
        return invokerProxyBindings;
    }

    /**
     * Sets the value of the invokerProxyBindings property.
     * 
     * @param value
     *            allowed object is {@link InvokerProxyBindings }
     * 
     */
    public void setInvokerProxyBindings(InvokerProxyBindings value) {
        this.invokerProxyBindings = value;
    }

    /**
     * Gets the value of the containerConfigurations property.
     * 
     * @return possible object is {@link ContainerConfigurations }
     * 
     */
    public ContainerConfigurations getContainerConfigurations() {
        return containerConfigurations;
    }

    /**
     * Sets the value of the containerConfigurations property.
     * 
     * @param value
     *            allowed object is {@link ContainerConfigurations }
     * 
     */
    public void setContainerConfigurations(ContainerConfigurations value) {
        this.containerConfigurations = value;
    }

}
