public class c.h.n.i1 extends c.h.n.l1 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.reflect.Field e;
	 public static Boolean f;
	 public static java.lang.reflect.Constructor g;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/reflect/Constructor<", */
	 /* "Landroid/view/WindowInsets;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static Boolean h;
/* # instance fields */
public android.view.WindowInsets c;
public c.h.g.b d;
/* # direct methods */
public static c.h.n.i1 ( ) {
/* .locals 0 */
return;
} // .end method
public c.h.n.i1 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Lc/h/n/l1;-><init>()V */
/* .line 2 */
c.h.n.i1 .c ( );
this.c = v0;
return;
} // .end method
public c.h.n.i1 ( ) {
/* .locals 0 */
/* .line 3 */
/* invoke-direct {p0, p1}, Lc/h/n/l1;-><init>(Lc/h/n/u1;)V */
/* .line 4 */
(( c.h.n.u1 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/h/n/u1;->k()Landroid/view/WindowInsets;
this.c = p1;
return;
} // .end method
public static android.view.WindowInsets c ( ) {
/* .locals 7 */
/* .line 1 */
/* sget-boolean v0, Lc/h/n/i1;->f:Z */
int v1 = 1; // const/4 v1, 0x1
final String v2 = "WindowInsetsCompat"; // const-string v2, "WindowInsetsCompat"
/* if-nez v0, :cond_0 */
/* .line 2 */
try { // :try_start_0
	 /* const-class v0, Landroid/view/WindowInsets; */
	 final String v3 = "CONSUMED"; // const-string v3, "CONSUMED"
	 (( java.lang.Class ) v0 ).getDeclaredField ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 final String v3 = "Could not retrieve WindowInsets.CONSUMED field"; // const-string v3, "Could not retrieve WindowInsets.CONSUMED field"
	 /* .line 3 */
	 android.util.Log .i ( v2,v3,v0 );
	 /* .line 4 */
} // :goto_0
c.h.n.i1.f = (v1!= 0);
/* .line 5 */
} // :cond_0
v0 = c.h.n.i1.e;
int v3 = 0; // const/4 v3, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
try { // :try_start_1
	 (( java.lang.reflect.Field ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v0, Landroid/view/WindowInsets; */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 7 */
		 /* new-instance v4, Landroid/view/WindowInsets; */
		 /* invoke-direct {v4, v0}, Landroid/view/WindowInsets;-><init>(Landroid/view/WindowInsets;)V */
		 /* :try_end_1 */
		 /* .catch Ljava/lang/ReflectiveOperationException; {:try_start_1 ..:try_end_1} :catch_1 */
		 /* :catch_1 */
		 /* move-exception v0 */
		 final String v4 = "Could not get value from WindowInsets.CONSUMED field"; // const-string v4, "Could not get value from WindowInsets.CONSUMED field"
		 /* .line 8 */
		 android.util.Log .i ( v2,v4,v0 );
		 /* .line 9 */
	 } // :cond_1
	 /* sget-boolean v0, Lc/h/n/i1;->h:Z */
	 int v4 = 0; // const/4 v4, 0x0
	 /* if-nez v0, :cond_2 */
	 /* .line 10 */
	 try { // :try_start_2
		 /* const-class v0, Landroid/view/WindowInsets; */
		 /* new-array v5, v1, [Ljava/lang/Class; */
		 /* const-class v6, Landroid/graphics/Rect; */
		 /* aput-object v6, v5, v4 */
		 (( java.lang.Class ) v0 ).getConstructor ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
		 /* :try_end_2 */
		 /* .catch Ljava/lang/ReflectiveOperationException; {:try_start_2 ..:try_end_2} :catch_2 */
		 /* :catch_2 */
		 /* move-exception v0 */
		 final String v5 = "Could not retrieve WindowInsets(Rect) constructor"; // const-string v5, "Could not retrieve WindowInsets(Rect) constructor"
		 /* .line 11 */
		 android.util.Log .i ( v2,v5,v0 );
		 /* .line 12 */
	 } // :goto_1
	 c.h.n.i1.h = (v1!= 0);
	 /* .line 13 */
} // :cond_2
v0 = c.h.n.i1.g;
if ( v0 != null) { // if-eqz v0, :cond_3
	 try { // :try_start_3
		 /* new-array v1, v1, [Ljava/lang/Object; */
		 /* .line 14 */
		 /* new-instance v5, Landroid/graphics/Rect; */
		 /* invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V */
		 /* aput-object v5, v1, v4 */
		 (( java.lang.reflect.Constructor ) v0 ).newInstance ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/view/WindowInsets; */
		 /* :try_end_3 */
		 /* .catch Ljava/lang/ReflectiveOperationException; {:try_start_3 ..:try_end_3} :catch_3 */
		 /* :catch_3 */
		 /* move-exception v0 */
		 final String v1 = "Could not invoke WindowInsets(Rect) constructor"; // const-string v1, "Could not invoke WindowInsets(Rect) constructor"
		 /* .line 15 */
		 android.util.Log .i ( v2,v1,v0 );
	 } // :cond_3
} // .end method
/* # virtual methods */
public c.h.n.u1 b ( ) {
	 /* .locals 2 */
	 /* .line 2 */
	 (( c.h.n.l1 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/n/l1;->a()V
	 /* .line 3 */
	 v0 = this.c;
	 c.h.n.u1 .a ( v0 );
	 /* .line 4 */
	 v1 = this.b;
	 (( c.h.n.u1 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/h/n/u1;->a([Lc/h/g/b;)V
	 /* .line 5 */
	 v1 = this.d;
	 (( c.h.n.u1 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lc/h/n/u1;->b(Lc/h/g/b;)V
} // .end method
public void b ( Object p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.d = p1;
	 return;
} // .end method
public void d ( Object p0 ) {
	 /* .locals 4 */
	 /* .line 1 */
	 v0 = this.c;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 /* iget v1, p1, Lc/h/g/b;->a:I */
		 /* iget v2, p1, Lc/h/g/b;->b:I */
		 /* iget v3, p1, Lc/h/g/b;->c:I */
		 /* iget p1, p1, Lc/h/g/b;->d:I */
		 (( android.view.WindowInsets ) v0 ).replaceSystemWindowInsets ( v1, v2, v3, p1 ); // invoke-virtual {v0, v1, v2, v3, p1}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;
		 this.c = p1;
	 } // :cond_0
	 return;
} // .end method
