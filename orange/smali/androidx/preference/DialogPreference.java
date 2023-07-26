public abstract class androidx.preference.DialogPreference extends androidx.preference.Preference {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.CharSequence v;
	 /* # direct methods */
	 public androidx.preference.DialogPreference ( ) {
		 /* .locals 2 */
		 /* .line 12 */
		 /* const v1, 0x1010091 */
		 v0 = 		 c.h.f.i.t .a ( p1,v0,v1 );
		 /* invoke-direct {p0, p1, p2, v0}, Landroidx/preference/DialogPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public androidx.preference.DialogPreference ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 11 */
		 /* invoke-direct {p0, p1, p2, p3, v0}, Landroidx/preference/DialogPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 return;
	 } // .end method
	 public androidx.preference.DialogPreference ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Landroidx/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 /* .line 2 */
		 v0 = c.q.f.DialogPreference;
		 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0, p3, p4 ); // invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
		 /* .line 3 */
		 c.h.f.i.t .b ( p1,p2,p3 );
		 this.v = p2;
		 /* if-nez p2, :cond_0 */
		 /* .line 4 */
		 (( androidx.preference.Preference ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->h()Ljava/lang/CharSequence;
		 this.v = p2;
		 /* .line 5 */
	 } // :cond_0
	 c.h.f.i.t .b ( p1,p2,p3 );
	 /* .line 6 */
	 c.h.f.i.t .a ( p1,p2,p3 );
	 /* .line 7 */
	 c.h.f.i.t .b ( p1,p2,p3 );
	 /* .line 8 */
	 c.h.f.i.t .b ( p1,p2,p3 );
	 /* .line 9 */
	 int p4 = 0; // const/4 p4, 0x0
	 c.h.f.i.t .b ( p1,p2,p3,p4 );
	 /* .line 10 */
	 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
	 return;
} // .end method
/* # virtual methods */
public void m ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 (( androidx.preference.Preference ) p0 ).f ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->f()Lc/q/b;
	 (( c.q.b ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lc/q/b;->a(Landroidx/preference/Preference;)V
	 return;
} // .end method
