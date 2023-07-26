public abstract class androidx.preference.TwoStatePreference extends androidx.preference.Preference {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.CharSequence v;
	 public java.lang.CharSequence w;
	 public Boolean x;
	 public Boolean y;
	 public Boolean z;
	 /* # direct methods */
	 public androidx.preference.TwoStatePreference ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* invoke-direct {p0, p1, p2, v0}, Landroidx/preference/TwoStatePreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public androidx.preference.TwoStatePreference ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2, p3, v0}, Landroidx/preference/TwoStatePreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 return;
	 } // .end method
	 public androidx.preference.TwoStatePreference ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object a ( android.content.res.TypedArray p0, Integer p1 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
		 p1 = 		 (( android.content.res.TypedArray ) p1 ).getBoolean ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
		 java.lang.Boolean .valueOf ( p1 );
	 } // .end method
	 public void a ( java.lang.CharSequence p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.w = p1;
		 /* .line 2 */
		 p1 = 		 (( androidx.preference.TwoStatePreference ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/preference/TwoStatePreference;->q()Z
		 /* if-nez p1, :cond_0 */
		 /* .line 3 */
		 (( androidx.preference.Preference ) p0 ).l ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->l()V
	 } // :cond_0
	 return;
} // .end method
public void b ( android.view.View p0 ) {
	 /* .locals 4 */
	 /* .line 4 */
	 /* instance-of v0, p1, Landroid/widget/TextView; */
	 /* if-nez v0, :cond_0 */
	 return;
	 /* .line 5 */
} // :cond_0
/* check-cast p1, Landroid/widget/TextView; */
int v0 = 1; // const/4 v0, 0x1
/* .line 6 */
/* iget-boolean v1, p0, Landroidx/preference/TwoStatePreference;->x:Z */
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_1
	 v1 = this.v;
	 v1 = 	 android.text.TextUtils .isEmpty ( v1 );
	 /* if-nez v1, :cond_1 */
	 /* .line 7 */
	 v0 = this.v;
	 (( android.widget.TextView ) p1 ).setText ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
/* .line 8 */
} // :cond_1
/* iget-boolean v1, p0, Landroidx/preference/TwoStatePreference;->x:Z */
/* if-nez v1, :cond_2 */
v1 = this.w;
v1 = android.text.TextUtils .isEmpty ( v1 );
/* if-nez v1, :cond_2 */
/* .line 9 */
v0 = this.w;
(( android.widget.TextView ) p1 ).setText ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // :cond_2
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 10 */
(( androidx.preference.Preference ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->g()Ljava/lang/CharSequence;
/* .line 11 */
v3 = android.text.TextUtils .isEmpty ( v1 );
/* if-nez v3, :cond_3 */
/* .line 12 */
(( android.widget.TextView ) p1 ).setText ( v1 ); // invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
int v0 = 0; // const/4 v0, 0x0
} // :cond_3
/* const/16 v1, 0x8 */
/* if-nez v0, :cond_4 */
} // :cond_4
/* const/16 v2, 0x8 */
/* .line 13 */
} // :goto_2
v0 = (( android.widget.TextView ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getVisibility()I
/* if-eq v2, v0, :cond_5 */
/* .line 14 */
(( android.widget.TextView ) p1 ).setVisibility ( v2 ); // invoke-virtual {p1, v2}, Landroid/widget/TextView;->setVisibility(I)V
} // :cond_5
return;
} // .end method
public void b ( java.lang.CharSequence p0 ) {
/* .locals 0 */
/* .line 1 */
this.v = p1;
/* .line 2 */
p1 = (( androidx.preference.TwoStatePreference ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/preference/TwoStatePreference;->q()Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
(( androidx.preference.Preference ) p0 ).l ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->l()V
} // :cond_0
return;
} // .end method
public void d ( Boolean p0 ) {
/* .locals 3 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/preference/TwoStatePreference;->x:Z */
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, p1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-nez v0, :cond_1 */
/* .line 2 */
/* iget-boolean v2, p0, Landroidx/preference/TwoStatePreference;->y:Z */
/* if-nez v2, :cond_2 */
/* .line 3 */
} // :cond_1
/* iput-boolean p1, p0, Landroidx/preference/TwoStatePreference;->x:Z */
/* .line 4 */
/* iput-boolean v1, p0, Landroidx/preference/TwoStatePreference;->y:Z */
/* .line 5 */
(( androidx.preference.Preference ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Landroidx/preference/Preference;->c(Z)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 6 */
p1 = (( androidx.preference.TwoStatePreference ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/preference/TwoStatePreference;->o()Z
(( androidx.preference.Preference ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/preference/Preference;->b(Z)V
/* .line 7 */
(( androidx.preference.Preference ) p0 ).l ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->l()V
} // :cond_2
return;
} // .end method
public void e ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Landroidx/preference/TwoStatePreference;->z:Z */
return;
} // .end method
public void m ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Landroidx/preference/Preference;->m()V */
/* .line 2 */
v0 = (( androidx.preference.TwoStatePreference ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/preference/TwoStatePreference;->q()Z
/* xor-int/lit8 v0, v0, 0x1 */
/* .line 3 */
java.lang.Boolean .valueOf ( v0 );
v1 = (( androidx.preference.Preference ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Landroidx/preference/Preference;->a(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
(( androidx.preference.TwoStatePreference ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Landroidx/preference/TwoStatePreference;->d(Z)V
} // :cond_0
return;
} // .end method
public Boolean o ( ) {
/* .locals 3 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/preference/TwoStatePreference;->z:Z */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Landroidx/preference/TwoStatePreference;->x:Z */
} // :cond_0
/* iget-boolean v0, p0, Landroidx/preference/TwoStatePreference;->x:Z */
/* if-nez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-nez v0, :cond_3 */
/* .line 2 */
v0 = /* invoke-super {p0}, Landroidx/preference/Preference;->o()Z */
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
} // :cond_3
} // :goto_1
} // .end method
public Boolean q ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/preference/TwoStatePreference;->x:Z */
} // .end method
