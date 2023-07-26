public class c.a.e implements c.a.j.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final androidx.activity.ComponentActivity a; //synthetic
	 /* # direct methods */
	 public c.a.e ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.content.Context p0 ) {
		 /* .locals 1 */
		 /* .annotation build Landroid/annotation/SuppressLint; */
		 /* value = { */
		 /* "SyntheticAccessor" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 p1 = this.a;
	 (( androidx.activity.ComponentActivity ) p1 ).c ( ); // invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->c()Landroidx/savedstate/SavedStateRegistry;
	 final String v0 = "android:support:activity-result"; // const-string v0, "android:support:activity-result"
	 /* .line 2 */
	 (( androidx.savedstate.SavedStateRegistry ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroidx/savedstate/SavedStateRegistry;->a(Ljava/lang/String;)Landroid/os/Bundle;
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 3 */
		 v0 = this.a;
		 androidx.activity.ComponentActivity .b ( v0 );
		 (( c.a.k.f ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/a/k/f;->a(Landroid/os/Bundle;)V
	 } // :cond_0
	 return;
} // .end method
