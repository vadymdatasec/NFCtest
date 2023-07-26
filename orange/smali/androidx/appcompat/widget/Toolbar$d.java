public class androidx.appcompat.widget.Toolbar$d implements c.b.p.o.z {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/appcompat/widget/Toolbar; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "d" */
} // .end annotation
/* # instance fields */
public c.b.p.o.m b;
public c.b.p.o.p c;
public final androidx.appcompat.widget.Toolbar d; //synthetic
/* # direct methods */
public androidx.appcompat.widget.Toolbar$d ( ) {
/* .locals 0 */
/* .line 1 */
this.d = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void a ( android.content.Context p0, Object p1 ) {
/* .locals 1 */
/* .line 1 */
p1 = this.b;
if ( p1 != null) { // if-eqz p1, :cond_0
	 v0 = this.c;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 (( c.b.p.o.m ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/b/p/o/m;->a(Lc/b/p/o/p;)Z
		 /* .line 3 */
	 } // :cond_0
	 this.b = p2;
	 return;
} // .end method
public void a ( Object p0, Boolean p1 ) {
	 /* .locals 0 */
	 return;
} // .end method
public void a ( c.b.p.o.z$a p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
public void a ( Boolean p0 ) {
	 /* .locals 4 */
	 /* .line 4 */
	 p1 = this.c;
	 if ( p1 != null) { // if-eqz p1, :cond_2
		 /* .line 5 */
		 p1 = this.b;
		 int v0 = 0; // const/4 v0, 0x0
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 6 */
			 p1 = 			 (( c.b.p.o.m ) p1 ).size ( ); // invoke-virtual {p1}, Lc/b/p/o/m;->size()I
			 int v1 = 0; // const/4 v1, 0x0
		 } // :goto_0
		 /* if-ge v1, p1, :cond_1 */
		 /* .line 7 */
		 v2 = this.b;
		 (( c.b.p.o.m ) v2 ).getItem ( v1 ); // invoke-virtual {v2, v1}, Lc/b/p/o/m;->getItem(I)Landroid/view/MenuItem;
		 /* .line 8 */
		 v3 = this.c;
		 /* if-ne v2, v3, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_0
	 /* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // :goto_1
/* if-nez v0, :cond_2 */
/* .line 9 */
p1 = this.b;
v0 = this.c;
(( androidx.appcompat.widget.Toolbar$d ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/Toolbar$d;->a(Lc/b/p/o/m;Lc/b/p/o/p;)Z
} // :cond_2
return;
} // .end method
public Boolean a ( c.b.p.o.g0 p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean a ( Object p0, Object p1 ) {
/* .locals 1 */
/* .line 10 */
p1 = this.d;
p1 = this.j;
/* instance-of v0, p1, Lc/b/p/d; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 11 */
/* check-cast p1, Lc/b/p/d; */
/* .line 12 */
} // :cond_0
p1 = this.d;
v0 = this.j;
(( android.view.ViewGroup ) p1 ).removeView ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
/* .line 13 */
p1 = this.d;
v0 = this.i;
(( android.view.ViewGroup ) p1 ).removeView ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
/* .line 14 */
p1 = this.d;
int v0 = 0; // const/4 v0, 0x0
this.j = v0;
/* .line 15 */
(( androidx.appcompat.widget.Toolbar ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->a()V
/* .line 16 */
this.c = v0;
/* .line 17 */
p1 = this.d;
(( android.view.ViewGroup ) p1 ).requestLayout ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->requestLayout()V
int p1 = 0; // const/4 p1, 0x0
/* .line 18 */
(( c.b.p.o.p ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Lc/b/p/o/p;->a(Z)V
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean b ( Object p0, Object p1 ) {
/* .locals 3 */
/* .line 1 */
p1 = this.d;
(( androidx.appcompat.widget.Toolbar ) p1 ).e ( ); // invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->e()V
/* .line 2 */
p1 = this.d;
p1 = this.i;
(( android.widget.ImageButton ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/widget/ImageButton;->getParent()Landroid/view/ViewParent;
/* .line 3 */
v0 = this.d;
/* if-eq p1, v0, :cond_1 */
/* .line 4 */
/* instance-of v1, p1, Landroid/view/ViewGroup; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 5 */
/* check-cast p1, Landroid/view/ViewGroup; */
v0 = this.i;
(( android.view.ViewGroup ) p1 ).removeView ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
/* .line 6 */
} // :cond_0
p1 = this.d;
v0 = this.i;
(( android.view.ViewGroup ) p1 ).addView ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
/* .line 7 */
} // :cond_1
p1 = this.d;
(( c.b.p.o.p ) p2 ).getActionView ( ); // invoke-virtual {p2}, Lc/b/p/o/p;->getActionView()Landroid/view/View;
this.j = v0;
/* .line 8 */
this.c = p2;
/* .line 9 */
p1 = this.d;
p1 = this.j;
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 10 */
v0 = this.d;
/* if-eq p1, v0, :cond_3 */
/* .line 11 */
/* instance-of v1, p1, Landroid/view/ViewGroup; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 12 */
/* check-cast p1, Landroid/view/ViewGroup; */
v0 = this.j;
(( android.view.ViewGroup ) p1 ).removeView ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
/* .line 13 */
} // :cond_2
p1 = this.d;
(( androidx.appcompat.widget.Toolbar ) p1 ).generateDefaultLayoutParams ( ); // invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->generateDefaultLayoutParams()Landroidx/appcompat/widget/Toolbar$e;
/* const v0, 0x800003 */
/* .line 14 */
v1 = this.d;
/* iget v2, v1, Landroidx/appcompat/widget/Toolbar;->o:I */
/* and-int/lit8 v2, v2, 0x70 */
/* or-int/2addr v0, v2 */
/* iput v0, p1, Lc/b/k/a$a;->a:I */
int v0 = 2; // const/4 v0, 0x2
/* .line 15 */
/* iput v0, p1, Landroidx/appcompat/widget/Toolbar$e;->b:I */
/* .line 16 */
v0 = this.j;
(( android.view.View ) v0 ).setLayoutParams ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 17 */
p1 = this.d;
v0 = this.j;
(( android.view.ViewGroup ) p1 ).addView ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
/* .line 18 */
} // :cond_3
p1 = this.d;
(( androidx.appcompat.widget.Toolbar ) p1 ).p ( ); // invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->p()V
/* .line 19 */
p1 = this.d;
(( android.view.ViewGroup ) p1 ).requestLayout ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->requestLayout()V
int p1 = 1; // const/4 p1, 0x1
/* .line 20 */
(( c.b.p.o.p ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Lc/b/p/o/p;->a(Z)V
/* .line 21 */
p2 = this.d;
p2 = this.j;
/* instance-of v0, p2, Lc/b/p/d; */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 22 */
/* check-cast p2, Lc/b/p/d; */
} // :cond_4
} // .end method
public Boolean c ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
