public abstract class c.h.o.n {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.reflect.Method a;
	 public static Boolean b;
	 public static java.lang.reflect.Field c;
	 public static Boolean d;
	 /* # direct methods */
	 public static void a ( android.widget.PopupWindow p0, Integer p1 ) {
		 /* .locals 6 */
		 /* .line 17 */
		 /* const/16 v1, 0x17 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 18 */
		 c.h.o.m .a ( p0,p1 );
		 /* .line 19 */
	 } // :cond_0
	 /* sget-boolean v0, Lc/h/o/n;->b:Z */
	 int v1 = 0; // const/4 v1, 0x0
	 int v2 = 1; // const/4 v2, 0x1
	 /* if-nez v0, :cond_1 */
	 /* .line 20 */
	 try { // :try_start_0
		 /* const-class v0, Landroid/widget/PopupWindow; */
		 final String v3 = "setWindowLayoutType"; // const-string v3, "setWindowLayoutType"
		 /* new-array v4, v2, [Ljava/lang/Class; */
		 v5 = java.lang.Integer.TYPE;
		 /* aput-object v5, v4, v1 */
		 (( java.lang.Class ) v0 ).getDeclaredMethod ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 /* .line 21 */
		 (( java.lang.reflect.Method ) v0 ).setAccessible ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 22 */
		 /* :catch_0 */
		 c.h.o.n.b = (v2!= 0);
		 /* .line 23 */
	 } // :cond_1
	 v0 = c.h.o.n.a;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 try { // :try_start_1
			 /* new-array v2, v2, [Ljava/lang/Object; */
			 /* .line 24 */
			 java.lang.Integer .valueOf ( p1 );
			 /* aput-object p1, v2, v1 */
			 (( java.lang.reflect.Method ) v0 ).invoke ( p0, v2 ); // invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* :try_end_1 */
			 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
			 /* :catch_1 */
		 } // :cond_2
	 } // :goto_0
	 return;
} // .end method
public static void a ( android.widget.PopupWindow p0, android.view.View p1, Integer p2, Integer p3, Integer p4 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* const/16 v1, 0x13 */
	 /* if-lt v0, v1, :cond_0 */
	 /* .line 2 */
	 c.h.o.l .a ( p0,p1,p2,p3,p4 );
	 /* .line 3 */
} // :cond_0
v0 = c.h.n.v0 .o ( p1 );
/* .line 4 */
p4 = c.h.n.i .a ( p4,v0 );
/* and-int/lit8 p4, p4, 0x7 */
int v0 = 5; // const/4 v0, 0x5
/* if-ne p4, v0, :cond_1 */
/* .line 5 */
p4 = (( android.widget.PopupWindow ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/widget/PopupWindow;->getWidth()I
v0 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* sub-int/2addr p4, v0 */
/* sub-int/2addr p2, p4 */
/* .line 6 */
} // :cond_1
(( android.widget.PopupWindow ) p0 ).showAsDropDown ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V
} // :goto_0
return;
} // .end method
public static void a ( android.widget.PopupWindow p0, Boolean p1 ) {
/* .locals 4 */
/* .line 7 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 8 */
c.h.o.m .a ( p0,p1 );
} // :cond_0
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_2 */
/* .line 9 */
/* sget-boolean v0, Lc/h/o/n;->d:Z */
final String v1 = "PopupWindowCompatApi21"; // const-string v1, "PopupWindowCompatApi21"
/* if-nez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 10 */
try { // :try_start_0
/* const-class v2, Landroid/widget/PopupWindow; */
final String v3 = "mOverlapAnchor"; // const-string v3, "mOverlapAnchor"
(( java.lang.Class ) v2 ).getDeclaredField ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 11 */
(( java.lang.reflect.Field ) v2 ).setAccessible ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchFieldException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v2 */
final String v3 = "Could not fetch mOverlapAnchor field from PopupWindow"; // const-string v3, "Could not fetch mOverlapAnchor field from PopupWindow"
/* .line 12 */
android.util.Log .i ( v1,v3,v2 );
/* .line 13 */
} // :goto_0
c.h.o.n.d = (v0!= 0);
/* .line 14 */
} // :cond_1
v0 = c.h.o.n.c;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 15 */
try { // :try_start_1
java.lang.Boolean .valueOf ( p1 );
(( java.lang.reflect.Field ) v0 ).set ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
/* :try_end_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception p0 */
final String p1 = "Could not set overlap anchor field in PopupWindow"; // const-string p1, "Could not set overlap anchor field in PopupWindow"
/* .line 16 */
android.util.Log .i ( v1,p1,p0 );
} // :cond_2
} // :goto_1
return;
} // .end method
