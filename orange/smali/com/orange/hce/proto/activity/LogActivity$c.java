public class com.orange.hce.proto.activity.LogActivity$c implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/orange/hce/proto/activity/LogActivity;->y()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final Integer b; //synthetic
public final com.orange.hce.proto.activity.LogActivity c; //synthetic
/* # direct methods */
public com.orange.hce.proto.activity.LogActivity$c ( ) {
/* .locals 0 */
/* .line 1 */
this.c = p1;
/* iput p2, p0, Lcom/orange/hce/proto/activity/LogActivity$c;->b:I */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
} // :goto_0
v1 = this.c;
com.orange.hce.proto.activity.LogActivity .e ( v1 );
v1 = (( android.view.ViewGroup ) v1 ).getChildCount ( ); // invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I
/* if-ge v0, v1, :cond_0 */
/* .line 2 */
v1 = this.c;
com.orange.hce.proto.activity.LogActivity .e ( v1 );
(( android.view.ViewGroup ) v1 ).getChildAt ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* check-cast v1, Le/h/b/a/l/e1; */
(( e.h.b.a.l.e1 ) v1 ).a ( ); // invoke-virtual {v1}, Le/h/b/a/l/e1;->a()V
/* add-int/lit8 v0, v0, 0x1 */
/* .line 3 */
} // :cond_0
v0 = this.c;
com.orange.hce.proto.activity.LogActivity .f ( v0 );
/* iget v1, p0, Lcom/orange/hce/proto/activity/LogActivity$c;->b:I */
/* int-to-long v1, v1 */
(( android.os.Handler ) v0 ).postDelayed ( p0, v1, v2 ); // invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
return;
} // .end method
