public class androidx.recyclerview.widget.RecyclerView$e implements c.r.d.c$a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Landroidx/recyclerview/widget/RecyclerView;->t()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final androidx.recyclerview.widget.RecyclerView a; //synthetic
/* # direct methods */
public androidx.recyclerview.widget.RecyclerView$e ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public android.view.View a ( Integer p0 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.a;
(( android.view.ViewGroup ) v0 ).getChildAt ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
} // .end method
public void a ( ) {
/* .locals 4 */
/* .line 4 */
v0 = (( androidx.recyclerview.widget.RecyclerView$e ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$e;->b()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 5 */
(( androidx.recyclerview.widget.RecyclerView$e ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$e;->a(I)Landroid/view/View;
/* .line 6 */
v3 = this.a;
(( androidx.recyclerview.widget.RecyclerView ) v3 ).b ( v2 ); // invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView;->b(Landroid/view/View;)V
/* .line 7 */
(( android.view.View ) v2 ).clearAnimation ( ); // invoke-virtual {v2}, Landroid/view/View;->clearAnimation()V
/* add-int/lit8 v1, v1, 0x1 */
/* .line 8 */
} // :cond_0
v0 = this.a;
(( android.view.ViewGroup ) v0 ).removeAllViews ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V
return;
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 1 */
/* .line 15 */
androidx.recyclerview.widget.RecyclerView .l ( p1 );
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 16 */
v0 = this.a;
(( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(Landroidx/recyclerview/widget/RecyclerView;)V
} // :cond_0
return;
} // .end method
public void a ( android.view.View p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( android.view.ViewGroup ) v0 ).addView ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V
/* .line 2 */
p2 = this.a;
(( androidx.recyclerview.widget.RecyclerView ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->a(Landroid/view/View;)V
return;
} // .end method
public void a ( android.view.View p0, Integer p1, android.view.ViewGroup$LayoutParams p2 ) {
/* .locals 2 */
/* .line 9 */
androidx.recyclerview.widget.RecyclerView .l ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 10 */
v1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).t ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->t()Z
/* if-nez v1, :cond_1 */
v1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).z ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->z()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 11 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String p3 = "Called attach on a child which is not detached: "; // const-string p3, "Called attach on a child which is not detached: "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
p3 = this.a;
/* .line 12 */
(( androidx.recyclerview.widget.RecyclerView ) p3 ).n ( ); // invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->n()Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 13 */
} // :cond_1
} // :goto_0
(( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).d ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->d()V
/* .line 14 */
} // :cond_2
v0 = this.a;
androidx.recyclerview.widget.RecyclerView .a ( v0,p1,p2,p3 );
return;
} // .end method
public Integer b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = (( android.view.ViewGroup ) v0 ).getChildCount ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I
} // .end method
public androidx.recyclerview.widget.RecyclerView$d0 b ( android.view.View p0 ) {
/* .locals 0 */
/* .line 6 */
androidx.recyclerview.widget.RecyclerView .l ( p1 );
} // .end method
public void b ( Integer p0 ) {
/* .locals 2 */
/* .line 2 */
v0 = this.a;
(( android.view.ViewGroup ) v0 ).getChildAt ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v1 = this.a;
(( androidx.recyclerview.widget.RecyclerView ) v1 ).b ( v0 ); // invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->b(Landroid/view/View;)V
/* .line 4 */
(( android.view.View ) v0 ).clearAnimation ( ); // invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V
/* .line 5 */
} // :cond_0
v0 = this.a;
(( android.view.ViewGroup ) v0 ).removeViewAt ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeViewAt(I)V
return;
} // .end method
public void c ( Integer p0 ) {
/* .locals 3 */
/* .line 1 */
(( androidx.recyclerview.widget.RecyclerView$e ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$e;->a(I)Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2 */
androidx.recyclerview.widget.RecyclerView .l ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 3 */
v1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).t ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->t()Z
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).z ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->z()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "called detach on an already detached child "; // const-string v2, "called detach on an already detached child "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
v0 = this.a;
/* .line 5 */
(( androidx.recyclerview.widget.RecyclerView ) v0 ).n ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->n()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_1
} // :goto_0
/* const/16 v1, 0x100 */
/* .line 6 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(I)V
/* .line 7 */
} // :cond_2
v0 = this.a;
androidx.recyclerview.widget.RecyclerView .a ( v0,p1 );
return;
} // .end method
public void c ( android.view.View p0 ) {
/* .locals 1 */
/* .line 8 */
androidx.recyclerview.widget.RecyclerView .l ( p1 );
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 9 */
v0 = this.a;
(( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->b(Landroidx/recyclerview/widget/RecyclerView;)V
} // :cond_0
return;
} // .end method
public Integer d ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
p1 = (( android.view.ViewGroup ) v0 ).indexOfChild ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I
} // .end method
