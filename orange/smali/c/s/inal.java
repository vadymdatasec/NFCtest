public class inal {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.s.c a;
	 public final androidx.savedstate.SavedStateRegistry b;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 /* new-instance p1, Landroidx/savedstate/SavedStateRegistry; */
		 /* invoke-direct {p1}, Landroidx/savedstate/SavedStateRegistry;-><init>()V */
		 this.b = p1;
		 return;
	 } // .end method
	 public static c.s.b a ( Object p0 ) {
		 /* .locals 1 */
		 /* .line 7 */
		 /* new-instance v0, Lc/s/b; */
		 /* invoke-direct {v0, p0}, Lc/s/b;-><init>(Lc/s/c;)V */
	 } // .end method
	 /* # virtual methods */
	 public androidx.savedstate.SavedStateRegistry a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
	 } // .end method
	 public void a ( android.os.Bundle p0 ) {
		 /* .locals 3 */
		 /* .line 2 */
		 v0 = this.a;
		 /* .line 3 */
		 (( c.n.g ) v0 ).a ( ); // invoke-virtual {v0}, Lc/n/g;->a()Lc/n/g$b;
		 v2 = c.n.g$b.c;
		 /* if-ne v1, v2, :cond_0 */
		 /* .line 4 */
		 /* new-instance v1, Landroidx/savedstate/Recreator; */
		 v2 = this.a;
		 /* invoke-direct {v1, v2}, Landroidx/savedstate/Recreator;-><init>(Lc/s/c;)V */
		 (( c.n.g ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/n/g;->a(Lc/n/i;)V
		 /* .line 5 */
		 v1 = this.b;
		 (( androidx.savedstate.SavedStateRegistry ) v1 ).a ( v0, p1 ); // invoke-virtual {v1, v0, p1}, Landroidx/savedstate/SavedStateRegistry;->a(Lc/n/g;Landroid/os/Bundle;)V
		 return;
		 /* .line 6 */
	 } // :cond_0
	 /* new-instance p1, Ljava/lang/IllegalStateException; */
	 final String v0 = "Restarter must be created only during owner\'s initialization stage"; // const-string v0, "Restarter must be created only during owner\'s initialization stage"
	 /* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw p1 */
} // .end method
public void b ( android.os.Bundle p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.b;
	 (( androidx.savedstate.SavedStateRegistry ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Landroidx/savedstate/SavedStateRegistry;->a(Landroid/os/Bundle;)V
	 return;
} // .end method
