public class androidx.recyclerview.widget.RecyclerView$h extends android.database.Observable {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/RecyclerView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "h" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/database/Observable<", */
/* "Landroidx/recyclerview/widget/RecyclerView$i;", */
/* ">;" */
/* } */
} // .end annotation
/* # direct methods */
public androidx.recyclerview.widget.RecyclerView$h ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Landroid/database/Observable;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.mObservers;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_0 */
/* .line 2 */
v1 = this.mObservers;
(( java.util.ArrayList ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroidx/recyclerview/widget/RecyclerView$i; */
(( androidx.recyclerview.widget.RecyclerView$i ) v1 ).a ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$i;->a()V
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_0
return;
} // .end method
public void a ( Integer p0, Integer p1 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
(( androidx.recyclerview.widget.RecyclerView$h ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView$h;->a(IILjava/lang/Object;)V
return;
} // .end method
public void a ( Integer p0, Integer p1, java.lang.Object p2 ) {
/* .locals 2 */
/* .line 4 */
v0 = this.mObservers;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_0 */
/* .line 5 */
v1 = this.mObservers;
(( java.util.ArrayList ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroidx/recyclerview/widget/RecyclerView$i; */
(( androidx.recyclerview.widget.RecyclerView$i ) v1 ).a ( p1, p2, p3 ); // invoke-virtual {v1, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$i;->a(IILjava/lang/Object;)V
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_0
return;
} // .end method
