/**
 */
package org.lpdql.evilmasterbase.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.lpdql.evilmasterbase.EvilmasterbaseFactory;
import org.lpdql.evilmasterbase.EvilmasterbasePackage;
import org.lpdql.evilmasterbase.Repere;

/**
 * This is the item provider adapter for a {@link org.lpdql.evilmasterbase.Repere} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RepereItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepereItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNomPropertyDescriptor(object);
			addPricePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addLocalisationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNomPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PricedElement_nom_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PricedElement_nom_feature",
								"_UI_PricedElement_type"),
						EvilmasterbasePackage.Literals.PRICED_ELEMENT__NOM, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Price feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPricePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PricedElement_price_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PricedElement_price_feature",
								"_UI_PricedElement_type"),
						EvilmasterbasePackage.Literals.PRICED_ELEMENT__PRICE, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DescribedElement_description_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DescribedElement_description_feature",
						"_UI_DescribedElement_type"),
				EvilmasterbasePackage.Literals.DESCRIBED_ELEMENT__DESCRIPTION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Localisation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalisationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Repere_localisation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Repere_localisation_feature",
								"_UI_Repere_type"),
						EvilmasterbasePackage.Literals.REPERE__LOCALISATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EvilmasterbasePackage.Literals.REPERE__SALLE);
			childrenFeatures.add(EvilmasterbasePackage.Literals.REPERE__BUREAU);
			childrenFeatures.add(EvilmasterbasePackage.Literals.REPERE__PORTE);
			childrenFeatures.add(EvilmasterbasePackage.Literals.REPERE__ENTREE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Repere.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Repere"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Repere) object).getNom();
		return label == null || label.length() == 0 ? getString("_UI_Repere_type")
				: getString("_UI_Repere_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Repere.class)) {
		case EvilmasterbasePackage.REPERE__NOM:
		case EvilmasterbasePackage.REPERE__PRICE:
		case EvilmasterbasePackage.REPERE__DESCRIPTION:
		case EvilmasterbasePackage.REPERE__LOCALISATION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case EvilmasterbasePackage.REPERE__SALLE:
		case EvilmasterbasePackage.REPERE__BUREAU:
		case EvilmasterbasePackage.REPERE__PORTE:
		case EvilmasterbasePackage.REPERE__ENTREE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(EvilmasterbasePackage.Literals.REPERE__SALLE,
				EvilmasterbaseFactory.eINSTANCE.createSalle()));

		newChildDescriptors.add(createChildParameter(EvilmasterbasePackage.Literals.REPERE__SALLE,
				EvilmasterbaseFactory.eINSTANCE.createBureau()));

		newChildDescriptors.add(createChildParameter(EvilmasterbasePackage.Literals.REPERE__SALLE,
				EvilmasterbaseFactory.eINSTANCE.createEntree()));

		newChildDescriptors.add(createChildParameter(EvilmasterbasePackage.Literals.REPERE__BUREAU,
				EvilmasterbaseFactory.eINSTANCE.createBureau()));

		newChildDescriptors.add(createChildParameter(EvilmasterbasePackage.Literals.REPERE__PORTE,
				EvilmasterbaseFactory.eINSTANCE.createPorte()));

		newChildDescriptors.add(createChildParameter(EvilmasterbasePackage.Literals.REPERE__ENTREE,
				EvilmasterbaseFactory.eINSTANCE.createEntree()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == EvilmasterbasePackage.Literals.REPERE__SALLE
				|| childFeature == EvilmasterbasePackage.Literals.REPERE__BUREAU
				|| childFeature == EvilmasterbasePackage.Literals.REPERE__ENTREE;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EvilmasterbaseEditPlugin.INSTANCE;
	}

}
