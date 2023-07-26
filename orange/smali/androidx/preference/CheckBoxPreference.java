public class androidx.preference.CheckBoxPreference extends androidx.preference.TwoStatePreference {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/preference/CheckBoxPreference$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public final androidx.preference.CheckBoxPreference$a A;
/* # direct methods */
public androidx.preference.CheckBoxPreference ( ) {
	 /* .locals 2 */
	 /* .line 9 */
	 /* const v1, 0x101008f */
	 v0 = 	 c.h.f.i.t .a ( p1,v0,v1 );
	 /* invoke-direct {p0, p1, p2, v0}, Landroidx/preference/CheckBoxPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 return;
} // .end method
public androidx.preference.CheckBoxPreference ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 1 */
	 /* invoke-direct {p0, p1, p2, p3, v0}, Landroidx/preference/CheckBoxPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
	 return;
} // .end method
public androidx.preference.CheckBoxPreference ( ) {
	 /* .locals 1 */
	 /* .line 2 */
	 /* invoke-direct {p0, p1, p2, p3, p4}, Landroidx/preference/TwoStatePreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
	 /* .line 3 */
	 /* new-instance v0, Landroidx/preference/CheckBoxPreference$a; */
	 /* invoke-direct {v0, p0}, Landroidx/preference/CheckBoxPreference$a;-><init>(Landroidx/preference/CheckBoxPreference;)V */
	 this.A = v0;
	 /* .line 4 */
	 v0 = c.q.f.CheckBoxPreference;
	 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0, p3, p4 ); // invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
	 /* .line 5 */
	 c.h.f.i.t .b ( p1,p2,p3 );
	 (( androidx.preference.TwoStatePreference ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Landroidx/preference/TwoStatePreference;->b(Ljava/lang/CharSequence;)V
	 /* .line 6 */
	 c.h.f.i.t .b ( p1,p2,p3 );
	 (( androidx.preference.TwoStatePreference ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroidx/preference/TwoStatePreference;->a(Ljava/lang/CharSequence;)V
	 /* .line 7 */
	 int p4 = 0; // const/4 p4, 0x0
	 p2 = 	 c.h.f.i.t .a ( p1,p2,p3,p4 );
	 (( androidx.preference.TwoStatePreference ) p0 ).e ( p2 ); // invoke-virtual {p0, p2}, Landroidx/preference/TwoStatePreference;->e(Z)V
	 /* .line 8 */
	 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
	 return;
} // .end method
/* # virtual methods */
public void a ( android.view.View p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-super {p0, p1}, Landroidx/preference/Preference;->a(Landroid/view/View;)V */
	 /* .line 2 */
	 (( androidx.preference.CheckBoxPreference ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Landroidx/preference/CheckBoxPreference;->d(Landroid/view/View;)V
	 return;
} // .end method
public final void c ( android.view.View p0 ) {
	 /* .locals 3 */
	 /* .line 1 */
	 /* instance-of v0, p1, Landroid/widget/CompoundButton; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 /* move-object v1, p1 */
		 /* check-cast v1, Landroid/widget/CompoundButton; */
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.widget.CompoundButton ) v1 ).setOnCheckedChangeListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
		 /* .line 3 */
	 } // :cond_0
	 /* instance-of v1, p1, Landroid/widget/Checkable; */
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 4 */
		 /* move-object v1, p1 */
		 /* check-cast v1, Landroid/widget/Checkable; */
		 /* iget-boolean v2, p0, Landroidx/preference/TwoStatePreference;->x:Z */
	 } // :cond_1
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 5 */
		 /* check-cast p1, Landroid/widget/CompoundButton; */
		 v0 = this.A;
		 (( android.widget.CompoundButton ) p1 ).setOnCheckedChangeListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
	 } // :cond_2
	 return;
} // .end method
public final void d ( android.view.View p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 (( androidx.preference.Preference ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->a()Landroid/content/Context;
	 final String v1 = "accessibility"; // const-string v1, "accessibility"
	 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast v0, Landroid/view/accessibility/AccessibilityManager; */
	 /* .line 2 */
	 v0 = 	 (( android.view.accessibility.AccessibilityManager ) v0 ).isEnabled ( ); // invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z
	 /* if-nez v0, :cond_0 */
	 return;
} // :cond_0
/* const v0, 0x1020001 */
/* .line 3 */
(( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* .line 4 */
(( androidx.preference.CheckBoxPreference ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/preference/CheckBoxPreference;->c(Landroid/view/View;)V
/* const v0, 0x1020010 */
/* .line 5 */
(( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* .line 6 */
(( androidx.preference.TwoStatePreference ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/preference/TwoStatePreference;->b(Landroid/view/View;)V
return;
} // .end method
