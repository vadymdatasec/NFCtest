public abstract class e.f.a.c.r.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Boolean a;
	 public static final b;
	 public static final c;
	 public static final d;
	 public static final e;
	 public static final f;
	 public static final g;
	 public static final h;
	 public static final i;
	 public static final j;
	 /* # direct methods */
	 public static e.f.a.c.r.a ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 int v1 = 1; // const/4 v1, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* const/16 v3, 0x15 */
		 /* if-lt v0, v3, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
e.f.a.c.r.a.a = (v0!= 0);
/* new-array v0, v1, [I */
/* const v3, 0x10100a7 */
/* aput v3, v0, v2 */
/* .line 2 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v3, v0, [I */
/* .line 3 */
/* fill-array-data v3, :array_0 */
/* new-array v3, v1, [I */
/* const v4, 0x101009c */
/* aput v4, v3, v2 */
/* .line 4 */
/* new-array v3, v1, [I */
/* const v4, 0x1010367 */
/* aput v4, v3, v2 */
/* .line 5 */
/* new-array v3, v0, [I */
/* .line 6 */
/* fill-array-data v3, :array_1 */
int v3 = 3; // const/4 v3, 0x3
/* new-array v3, v3, [I */
/* .line 7 */
/* fill-array-data v3, :array_2 */
/* new-array v3, v0, [I */
/* .line 8 */
/* fill-array-data v3, :array_3 */
/* new-array v0, v0, [I */
/* .line 9 */
/* fill-array-data v0, :array_4 */
/* new-array v0, v1, [I */
/* const v1, 0x10100a1 */
/* aput v1, v0, v2 */
/* .line 10 */
return;
/* nop */
/* :array_0 */
/* .array-data 4 */
/* 0x1010367 */
/* 0x101009c */
} // .end array-data
/* :array_1 */
/* .array-data 4 */
/* 0x10100a1 */
/* 0x10100a7 */
} // .end array-data
/* :array_2 */
/* .array-data 4 */
/* 0x10100a1 */
/* 0x1010367 */
/* 0x101009c */
} // .end array-data
/* :array_3 */
/* .array-data 4 */
/* 0x10100a1 */
/* 0x101009c */
} // .end array-data
/* :array_4 */
/* .array-data 4 */
/* 0x10100a1 */
/* 0x1010367 */
} // .end array-data
} // .end method
public static Integer a ( Integer p0 ) {
/* .locals 2 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x15 */
} // .end annotation
/* .line 28 */
v0 = android.graphics.Color .alpha ( p0 );
/* mul-int/lit8 v0, v0, 0x2 */
/* const/16 v1, 0xff */
v0 = java.lang.Math .min ( v0,v1 );
/* .line 29 */
p0 = c.h.g.a .c ( p0,v0 );
} // .end method
public static Integer a ( android.content.res.ColorStateList p0, Integer[] p1 ) {
/* .locals 1 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 26 */
v0 = (( android.content.res.ColorStateList ) p0 ).getDefaultColor ( ); // invoke-virtual {p0}, Landroid/content/res/ColorStateList;->getDefaultColor()I
p0 = (( android.content.res.ColorStateList ) p0 ).getColorForState ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
/* .line 27 */
} // :goto_0
/* sget-boolean p1, Le/f/a/c/r/a;->a:Z */
if ( p1 != null) { // if-eqz p1, :cond_1
p0 = e.f.a.c.r.a .a ( p0 );
} // :cond_1
} // .end method
public static android.content.res.ColorStateList a ( android.content.res.ColorStateList p0 ) {
/* .locals 6 */
/* .line 1 */
/* sget-boolean v0, Le/f/a/c/r/a;->a:Z */
int v1 = 2; // const/4 v1, 0x2
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-array v0, v1, [[I */
/* new-array v1, v1, [I */
/* .line 2 */
v4 = e.f.a.c.r.a.j;
/* aput-object v4, v0, v3 */
/* .line 3 */
v4 = e.f.a.c.r.a.f;
v4 = e.f.a.c.r.a .a ( p0,v4 );
/* aput v4, v1, v3 */
/* .line 4 */
v3 = android.util.StateSet.NOTHING;
/* aput-object v3, v0, v2 */
/* .line 5 */
v3 = e.f.a.c.r.a.b;
p0 = e.f.a.c.r.a .a ( p0,v3 );
/* aput p0, v1, v2 */
/* .line 6 */
/* new-instance p0, Landroid/content/res/ColorStateList; */
/* invoke-direct {p0, v0, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V */
} // :cond_0
/* const/16 v0, 0xa */
/* new-array v4, v0, [[I */
/* new-array v0, v0, [I */
/* .line 7 */
v5 = e.f.a.c.r.a.f;
/* aput-object v5, v4, v3 */
/* .line 8 */
v5 = e.f.a.c.r.a .a ( p0,v5 );
/* aput v5, v0, v3 */
/* .line 9 */
v5 = e.f.a.c.r.a.g;
/* aput-object v5, v4, v2 */
/* .line 10 */
v5 = e.f.a.c.r.a .a ( p0,v5 );
/* aput v5, v0, v2 */
/* .line 11 */
v2 = e.f.a.c.r.a.h;
/* aput-object v2, v4, v1 */
/* .line 12 */
v2 = e.f.a.c.r.a .a ( p0,v2 );
/* aput v2, v0, v1 */
int v1 = 3; // const/4 v1, 0x3
/* .line 13 */
v2 = e.f.a.c.r.a.i;
/* aput-object v2, v4, v1 */
/* .line 14 */
v2 = e.f.a.c.r.a .a ( p0,v2 );
/* aput v2, v0, v1 */
int v1 = 4; // const/4 v1, 0x4
/* .line 15 */
v2 = e.f.a.c.r.a.j;
/* aput-object v2, v4, v1 */
/* aput v3, v0, v1 */
int v1 = 5; // const/4 v1, 0x5
/* .line 16 */
v2 = e.f.a.c.r.a.b;
/* aput-object v2, v4, v1 */
/* .line 17 */
v2 = e.f.a.c.r.a .a ( p0,v2 );
/* aput v2, v0, v1 */
int v1 = 6; // const/4 v1, 0x6
/* .line 18 */
v2 = e.f.a.c.r.a.c;
/* aput-object v2, v4, v1 */
/* .line 19 */
v2 = e.f.a.c.r.a .a ( p0,v2 );
/* aput v2, v0, v1 */
int v1 = 7; // const/4 v1, 0x7
/* .line 20 */
v2 = e.f.a.c.r.a.d;
/* aput-object v2, v4, v1 */
/* .line 21 */
v2 = e.f.a.c.r.a .a ( p0,v2 );
/* aput v2, v0, v1 */
/* const/16 v1, 0x8 */
/* .line 22 */
v2 = e.f.a.c.r.a.e;
/* aput-object v2, v4, v1 */
/* .line 23 */
p0 = e.f.a.c.r.a .a ( p0,v2 );
/* aput p0, v0, v1 */
/* const/16 p0, 0x9 */
/* .line 24 */
v1 = android.util.StateSet.NOTHING;
/* aput-object v1, v4, p0 */
/* aput v3, v0, p0 */
/* .line 25 */
/* new-instance p0, Landroid/content/res/ColorStateList; */
/* invoke-direct {p0, v4, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V */
} // .end method
