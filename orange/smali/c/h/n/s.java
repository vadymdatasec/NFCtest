public class c.h.n.s {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.view.ViewParent a;
	 public android.view.ViewParent b;
	 public final android.view.View c;
	 public Boolean d;
	 public e;
	 /* # direct methods */
	 public c.h.n.s ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.c = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final android.view.ViewParent a ( Integer p0 ) {
		 /* .locals 1 */
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 int v0 = 1; // const/4 v0, 0x1
			 /* if-eq p1, v0, :cond_0 */
			 int p1 = 0; // const/4 p1, 0x0
			 /* .line 38 */
		 } // :cond_0
		 p1 = this.b;
		 /* .line 39 */
	 } // :cond_1
	 p1 = this.a;
} // .end method
public void a ( Integer p0, Integer p1, Integer p2, Integer p3, Integer[] p4, Integer p5, Integer[] p6 ) {
	 /* .locals 0 */
	 /* .line 15 */
	 /* invoke-virtual/range {p0 ..p7}, Lc/h/n/s;->b(IIII[II[I)Z */
	 return;
} // .end method
public final void a ( Integer p0, android.view.ViewParent p1 ) {
	 /* .locals 1 */
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 int v0 = 1; // const/4 v0, 0x1
		 /* if-eq p1, v0, :cond_0 */
		 /* .line 40 */
	 } // :cond_0
	 this.b = p2;
	 /* .line 41 */
} // :cond_1
this.a = p2;
} // :goto_0
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/h/n/s;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.c;
c.h.n.v0 .K ( v0 );
/* .line 3 */
} // :cond_0
/* iput-boolean p1, p0, Lc/h/n/s;->d:Z */
return;
} // .end method
public Boolean a ( Float p0, Float p1 ) {
/* .locals 2 */
/* .line 35 */
v0 = (( c.h.n.s ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/n/s;->c()Z
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 36 */
(( c.h.n.s ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lc/h/n/s;->a(I)Landroid/view/ViewParent;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 37 */
	 v1 = this.c;
	 p1 = 	 c.h.n.y0 .a ( v0,v1,p1,p2 );
} // :cond_0
} // .end method
public Boolean a ( Float p0, Float p1, Boolean p2 ) {
/* .locals 2 */
/* .line 32 */
v0 = (( c.h.n.s ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/n/s;->c()Z
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 33 */
	 (( c.h.n.s ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lc/h/n/s;->a(I)Landroid/view/ViewParent;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 34 */
		 v1 = this.c;
		 p1 = 		 c.h.n.y0 .a ( v0,v1,p1,p2,p3 );
	 } // :cond_0
} // .end method
public Boolean a ( Integer p0, Integer p1 ) {
	 /* .locals 4 */
	 /* .line 4 */
	 v0 = 	 (( c.h.n.s ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Lc/h/n/s;->b(I)Z
	 int v1 = 1; // const/4 v1, 0x1
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 5 */
	 } // :cond_0
	 v0 = 	 (( c.h.n.s ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/n/s;->c()Z
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* .line 6 */
		 v0 = this.c;
		 (( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
		 /* .line 7 */
		 v2 = this.c;
	 } // :goto_0
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* .line 8 */
		 v3 = this.c;
		 v3 = 		 c.h.n.y0 .b ( v0,v2,v3,p1,p2 );
		 if ( v3 != null) { // if-eqz v3, :cond_1
			 /* .line 9 */
			 (( c.h.n.s ) p0 ).a ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Lc/h/n/s;->a(ILandroid/view/ViewParent;)V
			 /* .line 10 */
			 v3 = this.c;
			 c.h.n.y0 .a ( v0,v2,v3,p1,p2 );
			 /* .line 11 */
		 } // :cond_1
		 /* instance-of v3, v0, Landroid/view/View; */
		 if ( v3 != null) { // if-eqz v3, :cond_2
			 /* .line 12 */
			 /* move-object v2, v0 */
			 /* check-cast v2, Landroid/view/View; */
			 /* .line 13 */
		 } // :cond_2
	 } // :cond_3
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean a ( Integer p0, Integer p1, Integer p2, Integer p3, Integer[] p4 ) {
	 /* .locals 8 */
	 int v6 = 0; // const/4 v6, 0x0
	 int v7 = 0; // const/4 v7, 0x0
	 /* move-object v0, p0 */
	 /* move v1, p1 */
	 /* move v2, p2 */
	 /* move v3, p3 */
	 /* move v4, p4 */
	 /* move-object v5, p5 */
	 /* .line 14 */
	 p1 = 	 /* invoke-virtual/range {v0 ..v7}, Lc/h/n/s;->b(IIII[II[I)Z */
} // .end method
public Boolean a ( Integer p0, Integer p1, Integer[] p2, Integer[] p3 ) {
	 /* .locals 6 */
	 int v5 = 0; // const/4 v5, 0x0
	 /* move-object v0, p0 */
	 /* move v1, p1 */
	 /* move v2, p2 */
	 /* move-object v3, p3 */
	 /* move-object v4, p4 */
	 /* .line 16 */
	 p1 = 	 /* invoke-virtual/range {v0 ..v5}, Lc/h/n/s;->a(II[I[II)Z */
} // .end method
public Boolean a ( Integer p0, Integer p1, Integer[] p2, Integer[] p3, Integer p4 ) {
	 /* .locals 10 */
	 /* .line 17 */
	 v0 = 	 (( c.h.n.s ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/n/s;->c()Z
	 int v1 = 0; // const/4 v1, 0x0
	 if ( v0 != null) { // if-eqz v0, :cond_7
		 /* .line 18 */
		 (( c.h.n.s ) p0 ).a ( p5 ); // invoke-virtual {p0, p5}, Lc/h/n/s;->a(I)Landroid/view/ViewParent;
		 /* if-nez v2, :cond_0 */
	 } // :cond_0
	 int v0 = 1; // const/4 v0, 0x1
	 /* if-nez p1, :cond_2 */
	 if ( p2 != null) { // if-eqz p2, :cond_1
	 } // :cond_1
	 if ( p4 != null) { // if-eqz p4, :cond_7
		 /* .line 19 */
		 /* aput v1, p4, v1 */
		 /* .line 20 */
		 /* aput v1, p4, v0 */
	 } // :cond_2
} // :goto_0
if ( p4 != null) { // if-eqz p4, :cond_3
	 /* .line 21 */
	 v3 = this.c;
	 (( android.view.View ) v3 ).getLocationInWindow ( p4 ); // invoke-virtual {v3, p4}, Landroid/view/View;->getLocationInWindow([I)V
	 /* .line 22 */
	 /* aget v3, p4, v1 */
	 /* .line 23 */
	 /* aget v4, p4, v0 */
	 /* move v8, v3 */
	 /* move v9, v4 */
} // :cond_3
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
} // :goto_1
/* if-nez p3, :cond_4 */
/* .line 24 */
(( c.h.n.s ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/n/s;->a()[I
/* .line 25 */
} // :cond_4
/* aput v1, p3, v1 */
/* .line 26 */
/* aput v1, p3, v0 */
/* .line 27 */
v3 = this.c;
/* move v4, p1 */
/* move v5, p2 */
/* move-object v6, p3 */
/* move v7, p5 */
/* invoke-static/range {v2 ..v7}, Lc/h/n/y0;->a(Landroid/view/ViewParent;Landroid/view/View;II[II)V */
if ( p4 != null) { // if-eqz p4, :cond_5
/* .line 28 */
p1 = this.c;
(( android.view.View ) p1 ).getLocationInWindow ( p4 ); // invoke-virtual {p1, p4}, Landroid/view/View;->getLocationInWindow([I)V
/* .line 29 */
/* aget p1, p4, v1 */
/* sub-int/2addr p1, v8 */
/* aput p1, p4, v1 */
/* .line 30 */
/* aget p1, p4, v0 */
/* sub-int/2addr p1, v9 */
/* aput p1, p4, v0 */
/* .line 31 */
} // :cond_5
/* aget p1, p3, v1 */
/* if-nez p1, :cond_6 */
/* aget p1, p3, v0 */
if ( p1 != null) { // if-eqz p1, :cond_7
} // :cond_6
int v1 = 1; // const/4 v1, 0x1
} // :cond_7
} // :goto_2
} // .end method
public final a ( ) {
/* .locals 1 */
/* .line 42 */
v0 = this.e;
/* if-nez v0, :cond_0 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [I */
/* .line 43 */
this.e = v0;
/* .line 44 */
} // :cond_0
v0 = this.e;
} // .end method
public Boolean b ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
v0 = (( c.h.n.s ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lc/h/n/s;->b(I)Z
} // .end method
public Boolean b ( Integer p0 ) {
/* .locals 0 */
/* .line 2 */
(( c.h.n.s ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/h/n/s;->a(I)Landroid/view/ViewParent;
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final Boolean b ( Integer p0, Integer p1, Integer p2, Integer p3, Integer[] p4, Integer p5, Integer[] p6 ) {
/* .locals 15 */
/* move-object v0, p0 */
/* move-object/from16 v1, p5 */
/* .line 3 */
v2 = (( c.h.n.s ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/n/s;->c()Z
int v3 = 0; // const/4 v3, 0x0
if ( v2 != null) { // if-eqz v2, :cond_6
/* move/from16 v2, p6 */
/* .line 4 */
(( c.h.n.s ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lc/h/n/s;->a(I)Landroid/view/ViewParent;
/* if-nez v4, :cond_0 */
} // :cond_0
int v12 = 1; // const/4 v12, 0x1
/* if-nez p1, :cond_2 */
/* if-nez p2, :cond_2 */
/* if-nez p3, :cond_2 */
if ( p4 != null) { // if-eqz p4, :cond_1
} // :cond_1
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 5 */
/* aput v3, v1, v3 */
/* .line 6 */
/* aput v3, v1, v12 */
} // :cond_2
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 7 */
v5 = this.c;
(( android.view.View ) v5 ).getLocationInWindow ( v1 ); // invoke-virtual {v5, v1}, Landroid/view/View;->getLocationInWindow([I)V
/* .line 8 */
/* aget v5, v1, v3 */
/* .line 9 */
/* aget v6, v1, v12 */
/* move v13, v5 */
/* move v14, v6 */
} // :cond_3
int v13 = 0; // const/4 v13, 0x0
int v14 = 0; // const/4 v14, 0x0
} // :goto_1
/* if-nez p7, :cond_4 */
/* .line 10 */
(( c.h.n.s ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/n/s;->a()[I
/* .line 11 */
/* aput v3, v5, v3 */
/* .line 12 */
/* aput v3, v5, v12 */
/* move-object v11, v5 */
} // :cond_4
/* move-object/from16 v11, p7 */
/* .line 13 */
} // :goto_2
v5 = this.c;
/* move/from16 v6, p1 */
/* move/from16 v7, p2 */
/* move/from16 v8, p3 */
/* move/from16 v9, p4 */
/* move/from16 v10, p6 */
/* invoke-static/range {v4 ..v11}, Lc/h/n/y0;->a(Landroid/view/ViewParent;Landroid/view/View;IIIII[I)V */
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 14 */
v2 = this.c;
(( android.view.View ) v2 ).getLocationInWindow ( v1 ); // invoke-virtual {v2, v1}, Landroid/view/View;->getLocationInWindow([I)V
/* .line 15 */
/* aget v2, v1, v3 */
/* sub-int/2addr v2, v13 */
/* aput v2, v1, v3 */
/* .line 16 */
/* aget v2, v1, v12 */
/* sub-int/2addr v2, v14 */
/* aput v2, v1, v12 */
} // :cond_5
} // :cond_6
} // :goto_3
} // .end method
public Boolean c ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/h/n/s;->d:Z */
} // .end method
public Boolean c ( Integer p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
p1 = (( c.h.n.s ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/h/n/s;->a(II)Z
} // .end method
public void d ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( c.h.n.s ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Lc/h/n/s;->d(I)V
return;
} // .end method
public void d ( Integer p0 ) {
/* .locals 2 */
/* .line 2 */
(( c.h.n.s ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/h/n/s;->a(I)Landroid/view/ViewParent;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v1 = this.c;
c.h.n.y0 .a ( v0,v1,p1 );
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
(( c.h.n.s ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/h/n/s;->a(ILandroid/view/ViewParent;)V
} // :cond_0
return;
} // .end method
