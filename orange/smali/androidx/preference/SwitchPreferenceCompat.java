public class androidx.preference.SwitchPreferenceCompat extends androidx.preference.TwoStatePreference {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/preference/SwitchPreferenceCompat$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public final androidx.preference.SwitchPreferenceCompat$a A;
public java.lang.CharSequence B;
public java.lang.CharSequence C;
/* # direct methods */
public androidx.preference.SwitchPreferenceCompat ( ) {
	 /* .locals 1 */
	 /* .line 11 */
	 /* invoke-direct {p0, p1, p2, v0}, Landroidx/preference/SwitchPreferenceCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 return;
} // .end method
public androidx.preference.SwitchPreferenceCompat ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 10 */
	 /* invoke-direct {p0, p1, p2, p3, v0}, Landroidx/preference/SwitchPreferenceCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
	 return;
} // .end method
public androidx.preference.SwitchPreferenceCompat ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0, p1, p2, p3, p4}, Landroidx/preference/TwoStatePreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
	 /* .line 2 */
	 /* new-instance v0, Landroidx/preference/SwitchPreferenceCompat$a; */
	 /* invoke-direct {v0, p0}, Landroidx/preference/SwitchPreferenceCompat$a;-><init>(Landroidx/preference/SwitchPreferenceCompat;)V */
	 this.A = v0;
	 /* .line 3 */
	 v0 = c.q.f.SwitchPreferenceCompat;
	 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0, p3, p4 ); // invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
	 /* .line 4 */
	 c.h.f.i.t .b ( p1,p2,p3 );
	 (( androidx.preference.TwoStatePreference ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Landroidx/preference/TwoStatePreference;->b(Ljava/lang/CharSequence;)V
	 /* .line 5 */
	 c.h.f.i.t .b ( p1,p2,p3 );
	 (( androidx.preference.TwoStatePreference ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroidx/preference/TwoStatePreference;->a(Ljava/lang/CharSequence;)V
	 /* .line 6 */
	 c.h.f.i.t .b ( p1,p2,p3 );
	 (( androidx.preference.SwitchPreferenceCompat ) p0 ).d ( p2 ); // invoke-virtual {p0, p2}, Landroidx/preference/SwitchPreferenceCompat;->d(Ljava/lang/CharSequence;)V
	 /* .line 7 */
	 c.h.f.i.t .b ( p1,p2,p3 );
	 (( androidx.preference.SwitchPreferenceCompat ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Landroidx/preference/SwitchPreferenceCompat;->c(Ljava/lang/CharSequence;)V
	 /* .line 8 */
	 int p4 = 0; // const/4 p4, 0x0
	 p2 = 	 c.h.f.i.t .a ( p1,p2,p3,p4 );
	 (( androidx.preference.TwoStatePreference ) p0 ).e ( p2 ); // invoke-virtual {p0, p2}, Landroidx/preference/TwoStatePreference;->e(Z)V
	 /* .line 9 */
	 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
	 return;
} // .end method
/* # virtual methods */
public void a ( android.view.View p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-super {p0, p1}, Landroidx/preference/Preference;->a(Landroid/view/View;)V */
	 /* .line 2 */
	 (( androidx.preference.SwitchPreferenceCompat ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Landroidx/preference/SwitchPreferenceCompat;->d(Landroid/view/View;)V
	 return;
} // .end method
public final void c ( android.view.View p0 ) {
	 /* .locals 3 */
	 /* .line 3 */
	 /* instance-of v0, p1, Landroidx/appcompat/widget/SwitchCompat; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 4 */
		 /* move-object v1, p1 */
		 /* check-cast v1, Landroidx/appcompat/widget/SwitchCompat; */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 5 */
		 (( android.widget.CompoundButton ) v1 ).setOnCheckedChangeListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
		 /* .line 6 */
	 } // :cond_0
	 /* instance-of v1, p1, Landroid/widget/Checkable; */
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 7 */
		 /* move-object v1, p1 */
		 /* check-cast v1, Landroid/widget/Checkable; */
		 /* iget-boolean v2, p0, Landroidx/preference/TwoStatePreference;->x:Z */
	 } // :cond_1
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 8 */
		 /* check-cast p1, Landroidx/appcompat/widget/SwitchCompat; */
		 /* .line 9 */
		 v0 = this.B;
		 (( androidx.appcompat.widget.SwitchCompat ) p1 ).setTextOn ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SwitchCompat;->setTextOn(Ljava/lang/CharSequence;)V
		 /* .line 10 */
		 v0 = this.C;
		 (( androidx.appcompat.widget.SwitchCompat ) p1 ).setTextOff ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SwitchCompat;->setTextOff(Ljava/lang/CharSequence;)V
		 /* .line 11 */
		 v0 = this.A;
		 (( android.widget.CompoundButton ) p1 ).setOnCheckedChangeListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
	 } // :cond_2
	 return;
} // .end method
public void c ( java.lang.CharSequence p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.C = p1;
	 /* .line 2 */
	 (( androidx.preference.Preference ) p0 ).l ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->l()V
	 return;
} // .end method
public final void d ( android.view.View p0 ) {
	 /* .locals 2 */
	 /* .line 3 */
	 (( androidx.preference.Preference ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->a()Landroid/content/Context;
	 final String v1 = "accessibility"; // const-string v1, "accessibility"
	 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast v0, Landroid/view/accessibility/AccessibilityManager; */
	 /* .line 4 */
	 v0 = 	 (( android.view.accessibility.AccessibilityManager ) v0 ).isEnabled ( ); // invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z
	 /* if-nez v0, :cond_0 */
	 return;
	 /* .line 5 */
} // :cond_0
(( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* .line 6 */
(( androidx.preference.SwitchPreferenceCompat ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/preference/SwitchPreferenceCompat;->c(Landroid/view/View;)V
/* const v0, 0x1020010 */
/* .line 7 */
(( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* .line 8 */
(( androidx.preference.TwoStatePreference ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/preference/TwoStatePreference;->b(Landroid/view/View;)V
return;
} // .end method
public void d ( java.lang.CharSequence p0 ) {
/* .locals 0 */
/* .line 1 */
this.B = p1;
/* .line 2 */
(( androidx.preference.Preference ) p0 ).l ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->l()V
return;
} // .end method
