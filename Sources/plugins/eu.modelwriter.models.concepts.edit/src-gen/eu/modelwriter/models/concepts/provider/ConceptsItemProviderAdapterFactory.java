/**
 */
package eu.modelwriter.models.concepts.provider;

import eu.modelwriter.models.concepts.util.ConceptsAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConceptsItemProviderAdapterFactory extends ConceptsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.modelwriter.models.concepts.ConceptsRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptsRootItemProvider conceptsRootItemProvider;

	/**
	 * This creates an adapter for a {@link eu.modelwriter.models.concepts.ConceptsRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptsRootAdapter() {
		if (conceptsRootItemProvider == null) {
			conceptsRootItemProvider = new ConceptsRootItemProvider(this);
		}

		return conceptsRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.modelwriter.models.concepts.JavaConceptsContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaConceptsContainerItemProvider javaConceptsContainerItemProvider;

	/**
	 * This creates an adapter for a {@link eu.modelwriter.models.concepts.JavaConceptsContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaConceptsContainerAdapter() {
		if (javaConceptsContainerItemProvider == null) {
			javaConceptsContainerItemProvider = new JavaConceptsContainerItemProvider(this);
		}

		return javaConceptsContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.modelwriter.models.concepts.resourcesConcepts} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected resourcesConceptsItemProvider resourcesConceptsItemProvider;

	/**
	 * This creates an adapter for a {@link eu.modelwriter.models.concepts.resourcesConcepts}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createresourcesConceptsAdapter() {
		if (resourcesConceptsItemProvider == null) {
			resourcesConceptsItemProvider = new resourcesConceptsItemProvider(this);
		}

		return resourcesConceptsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.modelwriter.models.concepts.ContextPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextPackageItemProvider contextPackageItemProvider;

	/**
	 * This creates an adapter for a {@link eu.modelwriter.models.concepts.ContextPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContextPackageAdapter() {
		if (contextPackageItemProvider == null) {
			contextPackageItemProvider = new ContextPackageItemProvider(this);
		}

		return contextPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.modelwriter.models.concepts.ConceptClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptClassItemProvider conceptClassItemProvider;

	/**
	 * This creates an adapter for a {@link eu.modelwriter.models.concepts.ConceptClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptClassAdapter() {
		if (conceptClassItemProvider == null) {
			conceptClassItemProvider = new ConceptClassItemProvider(this);
		}

		return conceptClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.modelwriter.models.concepts.ConceptVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptVariableItemProvider conceptVariableItemProvider;

	/**
	 * This creates an adapter for a {@link eu.modelwriter.models.concepts.ConceptVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptVariableAdapter() {
		if (conceptVariableItemProvider == null) {
			conceptVariableItemProvider = new ConceptVariableItemProvider(this);
		}

		return conceptVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.modelwriter.models.concepts.ConceptMethod} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMethodItemProvider conceptMethodItemProvider;

	/**
	 * This creates an adapter for a {@link eu.modelwriter.models.concepts.ConceptMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptMethodAdapter() {
		if (conceptMethodItemProvider == null) {
			conceptMethodItemProvider = new ConceptMethodItemProvider(this);
		}

		return conceptMethodItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.modelwriter.models.concepts.ConceptParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptParameterItemProvider conceptParameterItemProvider;

	/**
	 * This creates an adapter for a {@link eu.modelwriter.models.concepts.ConceptParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptParameterAdapter() {
		if (conceptParameterItemProvider == null) {
			conceptParameterItemProvider = new ConceptParameterItemProvider(this);
		}

		return conceptParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.modelwriter.models.concepts.Type} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeItemProvider typeItemProvider;

	/**
	 * This creates an adapter for a {@link eu.modelwriter.models.concepts.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeAdapter() {
		if (typeItemProvider == null) {
			typeItemProvider = new TypeItemProvider(this);
		}

		return typeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.modelwriter.models.concepts.NamedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementItemProvider namedElementItemProvider;

	/**
	 * This creates an adapter for a {@link eu.modelwriter.models.concepts.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamedElementAdapter() {
		if (namedElementItemProvider == null) {
			namedElementItemProvider = new NamedElementItemProvider(this);
		}

		return namedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.modelwriter.models.concepts.DerivedConcept} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedConceptItemProvider derivedConceptItemProvider;

	/**
	 * This creates an adapter for a {@link eu.modelwriter.models.concepts.DerivedConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDerivedConceptAdapter() {
		if (derivedConceptItemProvider == null) {
			derivedConceptItemProvider = new DerivedConceptItemProvider(this);
		}

		return derivedConceptItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (conceptsRootItemProvider != null) conceptsRootItemProvider.dispose();
		if (javaConceptsContainerItemProvider != null) javaConceptsContainerItemProvider.dispose();
		if (resourcesConceptsItemProvider != null) resourcesConceptsItemProvider.dispose();
		if (contextPackageItemProvider != null) contextPackageItemProvider.dispose();
		if (conceptClassItemProvider != null) conceptClassItemProvider.dispose();
		if (conceptVariableItemProvider != null) conceptVariableItemProvider.dispose();
		if (conceptMethodItemProvider != null) conceptMethodItemProvider.dispose();
		if (conceptParameterItemProvider != null) conceptParameterItemProvider.dispose();
		if (typeItemProvider != null) typeItemProvider.dispose();
		if (namedElementItemProvider != null) namedElementItemProvider.dispose();
		if (derivedConceptItemProvider != null) derivedConceptItemProvider.dispose();
	}

}
