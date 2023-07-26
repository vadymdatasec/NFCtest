public class inal extends androidx.preference.PreferenceGroup {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* const v1, 0x101008b */
		 v0 = 		 c.h.f.i.t .a ( p1,v0,v1 );
		 /* invoke-direct {p0, p1, p2, v0}, Landroidx/preference/PreferenceGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void m ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( androidx.preference.Preference ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->d()Landroid/content/Intent;
		 /* if-nez v0, :cond_1 */
		 (( androidx.preference.Preference ) p0 ).c ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->c()Ljava/lang/String;
		 /* if-nez v0, :cond_1 */
		 v0 = 		 (( androidx.preference.PreferenceGroup ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/preference/PreferenceGroup;->q()I
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 (( androidx.preference.Preference ) p0 ).f ( ); // invoke-virtual {p0}, Landroidx/preference/Preference;->f()Lc/q/b;
	 (( c.q.b ) v0 ).b ( ); // invoke-virtual {v0}, Lc/q/b;->b()Lc/q/b$a;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 3 */
	 } // :cond_1
} // :goto_0
return;
} // .end method
