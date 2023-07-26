public abstract class c.h.o.e {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.reflect.Field a;
	 public static Boolean b;
	 /* # direct methods */
	 public static android.graphics.drawable.Drawable a ( android.widget.CompoundButton p0 ) {
		 /* .locals 4 */
		 /* .line 9 */
		 /* const/16 v1, 0x17 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 10 */
		 (( android.widget.CompoundButton ) p0 ).getButtonDrawable ( ); // invoke-virtual {p0}, Landroid/widget/CompoundButton;->getButtonDrawable()Landroid/graphics/drawable/Drawable;
		 /* .line 11 */
	 } // :cond_0
	 /* sget-boolean v0, Lc/h/o/e;->b:Z */
	 final String v1 = "CompoundButtonCompat"; // const-string v1, "CompoundButtonCompat"
	 /* if-nez v0, :cond_1 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 12 */
	 try { // :try_start_0
		 /* const-class v2, Landroid/widget/CompoundButton; */
		 final String v3 = "mButtonDrawable"; // const-string v3, "mButtonDrawable"
		 (( java.lang.Class ) v2 ).getDeclaredField ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
		 /* .line 13 */
		 (( java.lang.reflect.Field ) v2 ).setAccessible ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
		 /* :try_end_0 */
		 /* .catch Ljava/lang/NoSuchFieldException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v2 */
		 final String v3 = "Failed to retrieve mButtonDrawable field"; // const-string v3, "Failed to retrieve mButtonDrawable field"
		 /* .line 14 */
		 android.util.Log .i ( v1,v3,v2 );
		 /* .line 15 */
	 } // :goto_0
	 c.h.o.e.b = (v0!= 0);
	 /* .line 16 */
} // :cond_1
v0 = c.h.o.e.a;
int v2 = 0; // const/4 v2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 17 */
	 try { // :try_start_1
		 (( java.lang.reflect.Field ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast p0, Landroid/graphics/drawable/Drawable; */
		 /* :try_end_1 */
		 /* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_1 */
		 /* :catch_1 */
		 /* move-exception p0 */
		 final String v0 = "Failed to get button drawable via reflection"; // const-string v0, "Failed to get button drawable via reflection"
		 /* .line 18 */
		 android.util.Log .i ( v1,v0,p0 );
		 /* .line 19 */
	 } // :cond_2
} // .end method
public static void a ( android.widget.CompoundButton p0, android.content.res.ColorStateList p1 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* const/16 v1, 0x15 */
	 /* if-lt v0, v1, :cond_0 */
	 /* .line 2 */
	 (( android.widget.CompoundButton ) p0 ).setButtonTintList ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V
	 /* .line 3 */
} // :cond_0
/* instance-of v0, p0, Lc/h/o/q; */
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 4 */
	 /* check-cast p0, Lc/h/o/q; */
} // :cond_1
} // :goto_0
return;
} // .end method
public static void a ( android.widget.CompoundButton p0, android.graphics.PorterDuff$Mode p1 ) {
/* .locals 2 */
/* .line 5 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 6 */
(( android.widget.CompoundButton ) p0 ).setButtonTintMode ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
/* .line 7 */
} // :cond_0
/* instance-of v0, p0, Lc/h/o/q; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 8 */
/* check-cast p0, Lc/h/o/q; */
} // :cond_1
} // :goto_0
return;
} // .end method
