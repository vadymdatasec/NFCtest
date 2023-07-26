public class androidx.preference.EditTextPreference extends androidx.preference.DialogPreference {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.String w;
	 /* # direct methods */
	 public androidx.preference.EditTextPreference ( ) {
		 /* .locals 2 */
		 /* .line 3 */
		 /* const v1, 0x1010092 */
		 v0 = 		 c.h.f.i.t .a ( p1,v0,v1 );
		 /* invoke-direct {p0, p1, p2, v0}, Landroidx/preference/EditTextPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public androidx.preference.EditTextPreference ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2, p3, v0}, Landroidx/preference/EditTextPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 return;
	 } // .end method
	 public androidx.preference.EditTextPreference ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Landroidx/preference/DialogPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object a ( android.content.res.TypedArray p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.content.res.TypedArray ) p1 ).getString ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
	 } // .end method
	 public Boolean o ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.w;
		 v0 = 		 android.text.TextUtils .isEmpty ( v0 );
		 /* if-nez v0, :cond_1 */
		 v0 = 		 /* invoke-super {p0}, Landroidx/preference/Preference;->o()Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
