public class androidx.preference.MultiSelectListPreference extends androidx.preference.internal.AbstractMultiSelectListPreference {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public androidx.preference.MultiSelectListPreference ( ) {
		 /* .locals 2 */
		 /* .line 8 */
		 /* const v1, 0x1010091 */
		 v0 = 		 c.h.f.i.t .a ( p1,v0,v1 );
		 /* invoke-direct {p0, p1, p2, v0}, Landroidx/preference/MultiSelectListPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public androidx.preference.MultiSelectListPreference ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 7 */
		 /* invoke-direct {p0, p1, p2, p3, v0}, Landroidx/preference/MultiSelectListPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 return;
	 } // .end method
	 public androidx.preference.MultiSelectListPreference ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Landroidx/preference/internal/AbstractMultiSelectListPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/util/HashSet; */
		 /* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
		 /* .line 3 */
		 v0 = c.q.f.MultiSelectListPreference;
		 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0, p3, p4 ); // invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
		 /* .line 4 */
		 c.h.f.i.t .d ( p1,p2,p3 );
		 /* .line 5 */
		 c.h.f.i.t .d ( p1,p2,p3 );
		 /* .line 6 */
		 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object a ( android.content.res.TypedArray p0, Integer p1 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 (( android.content.res.TypedArray ) p1 ).getTextArray ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getTextArray(I)[Ljava/lang/CharSequence;
		 /* .line 2 */
		 /* new-instance p2, Ljava/util/HashSet; */
		 /* invoke-direct {p2}, Ljava/util/HashSet;-><init>()V */
		 /* .line 3 */
		 /* array-length v0, p1 */
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
	 /* if-ge v1, v0, :cond_0 */
	 /* aget-object v2, p1, v1 */
	 /* .line 4 */
	 /* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
} // .end method
