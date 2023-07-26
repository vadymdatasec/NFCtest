public class androidx.savedstate.SavedStateRegistry$1 implements c.n.e {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Landroidx/savedstate/SavedStateRegistry;->a(Lc/n/g;Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final androidx.savedstate.SavedStateRegistry a; //synthetic
/* # direct methods */
public androidx.savedstate.SavedStateRegistry$1 ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void a ( Object p0, c.n.g$a p1 ) {
/* .locals 0 */
/* .line 1 */
p1 = c.n.g$a.ON_START;
/* if-ne p2, p1, :cond_0 */
/* .line 2 */
p1 = this.a;
int p2 = 1; // const/4 p2, 0x1
/* iput-boolean p2, p1, Landroidx/savedstate/SavedStateRegistry;->e:Z */
/* .line 3 */
} // :cond_0
p1 = c.n.g$a.ON_STOP;
/* if-ne p2, p1, :cond_1 */
/* .line 4 */
p1 = this.a;
int p2 = 0; // const/4 p2, 0x0
/* iput-boolean p2, p1, Landroidx/savedstate/SavedStateRegistry;->e:Z */
} // :cond_1
} // :goto_0
return;
} // .end method
