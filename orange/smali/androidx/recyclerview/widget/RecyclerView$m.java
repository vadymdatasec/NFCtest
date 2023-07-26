public class androidx.recyclerview.widget.RecyclerView$m implements androidx.recyclerview.widget.RecyclerView$l$a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/RecyclerView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "m" */
} // .end annotation
/* # instance fields */
public final androidx.recyclerview.widget.RecyclerView a; //synthetic
/* # direct methods */
public androidx.recyclerview.widget.RecyclerView$m ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void a ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(Z)V
/* .line 2 */
v0 = this.h;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.i;
	 /* if-nez v0, :cond_0 */
	 /* .line 3 */
	 this.h = v1;
	 /* .line 4 */
} // :cond_0
this.i = v1;
/* .line 5 */
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).y ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->y()Z
/* if-nez v0, :cond_1 */
/* .line 6 */
v0 = this.a;
v1 = this.a;
v0 = (( androidx.recyclerview.widget.RecyclerView ) v0 ).j ( v1 ); // invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->j(Landroid/view/View;)Z
/* if-nez v0, :cond_1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).t ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->t()Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 7 */
	 v0 = this.a;
	 p1 = this.a;
	 int v1 = 0; // const/4 v1, 0x0
	 (( androidx.recyclerview.widget.RecyclerView ) v0 ).removeDetachedView ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V
} // :cond_1
return;
} // .end method
