public class c.l.d.d0 implements c.a.j.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.l.d.f0 a; //synthetic
	 /* # direct methods */
	 public c.l.d.d0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.content.Context p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = this.a;
		 p1 = this.j;
		 int v0 = 0; // const/4 v0, 0x0
		 (( c.l.d.p0 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/l/d/p0;->a(Landroidx/fragment/app/Fragment;)V
		 /* .line 2 */
		 p1 = this.a;
		 (( androidx.activity.ComponentActivity ) p1 ).c ( ); // invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->c()Landroidx/savedstate/SavedStateRegistry;
		 final String v0 = "android:support:fragments"; // const-string v0, "android:support:fragments"
		 /* .line 3 */
		 (( androidx.savedstate.SavedStateRegistry ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroidx/savedstate/SavedStateRegistry;->a(Ljava/lang/String;)Landroid/os/Bundle;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 4 */
			 (( android.os.Bundle ) p1 ).getParcelable ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
			 /* .line 5 */
			 v0 = this.a;
			 v0 = this.j;
			 (( c.l.d.p0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/p0;->a(Landroid/os/Parcelable;)V
		 } // :cond_0
		 return;
	 } // .end method
