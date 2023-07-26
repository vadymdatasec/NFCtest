public class androidx.preference.DropDownPreference extends androidx.preference.ListPreference {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context B;
	 public final android.widget.ArrayAdapter C;
	 public android.widget.Spinner D;
	 /* # direct methods */
	 public androidx.preference.DropDownPreference ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Landroidx/preference/DropDownPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public androidx.preference.DropDownPreference ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2, p3, v0}, Landroidx/preference/DropDownPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 return;
	 } // .end method
	 public androidx.preference.DropDownPreference ( ) {
		 /* .locals 0 */
		 /* .line 3 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Landroidx/preference/ListPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 /* .line 4 */
		 /* new-instance p2, Landroidx/preference/DropDownPreference$a; */
		 /* invoke-direct {p2, p0}, Landroidx/preference/DropDownPreference$a;-><init>(Landroidx/preference/DropDownPreference;)V */
		 /* .line 5 */
		 this.B = p1;
		 /* .line 6 */
		 (( androidx.preference.DropDownPreference ) p0 ).v ( ); // invoke-virtual {p0}, Landroidx/preference/DropDownPreference;->v()Landroid/widget/ArrayAdapter;
		 this.C = p1;
		 /* .line 7 */
		 (( androidx.preference.DropDownPreference ) p0 ).w ( ); // invoke-virtual {p0}, Landroidx/preference/DropDownPreference;->w()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void l ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-super {p0}, Landroidx/preference/Preference;->l()V */
		 /* .line 2 */
		 v0 = this.C;
		 (( android.widget.ArrayAdapter ) v0 ).notifyDataSetChanged ( ); // invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V
		 return;
	 } // .end method
	 public void m ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.D;
		 (( android.widget.Spinner ) v0 ).performClick ( ); // invoke-virtual {v0}, Landroid/widget/Spinner;->performClick()Z
		 return;
	 } // .end method
	 public android.widget.ArrayAdapter v ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Landroid/widget/ArrayAdapter; */
		 v1 = this.B;
		 /* const v2, 0x1090009 */
		 /* invoke-direct {v0, v1, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V */
	 } // .end method
	 public final void w ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 v0 = this.C;
		 (( android.widget.ArrayAdapter ) v0 ).clear ( ); // invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->clear()V
		 /* .line 2 */
		 (( androidx.preference.ListPreference ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/preference/ListPreference;->q()[Ljava/lang/CharSequence;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 3 */
			 (( androidx.preference.ListPreference ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/preference/ListPreference;->q()[Ljava/lang/CharSequence;
			 /* array-length v1, v0 */
			 int v2 = 0; // const/4 v2, 0x0
		 } // :goto_0
		 /* if-ge v2, v1, :cond_0 */
		 /* aget-object v3, v0, v2 */
		 /* .line 4 */
		 v4 = this.C;
		 (( android.widget.ArrayAdapter ) v4 ).add ( v3 ); // invoke-virtual {v4, v3}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V
		 /* add-int/lit8 v2, v2, 0x1 */
	 } // :cond_0
	 return;
} // .end method
