public abstract class c.h.n.g1 {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "SoonBlockedPrivateApi" */
	 /* } */
} // .end annotation
/* # static fields */
public static java.lang.reflect.Field a;
public static java.lang.reflect.Field b;
public static java.lang.reflect.Field c;
public static Boolean d;
/* # direct methods */
public static c.h.n.g1 ( ) {
	 /* .locals 3 */
	 /* .line 1 */
	 try { // :try_start_0
		 /* const-class v0, Landroid/view/View; */
		 final String v1 = "mAttachInfo"; // const-string v1, "mAttachInfo"
		 (( java.lang.Class ) v0 ).getDeclaredField ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 2 */
		 (( java.lang.reflect.Field ) v0 ).setAccessible ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
		 final String v0 = "android.view.View$AttachInfo"; // const-string v0, "android.view.View$AttachInfo"
		 /* .line 3 */
		 java.lang.Class .forName ( v0 );
		 final String v2 = "mStableInsets"; // const-string v2, "mStableInsets"
		 /* .line 4 */
		 (( java.lang.Class ) v0 ).getDeclaredField ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
		 /* .line 5 */
		 (( java.lang.reflect.Field ) v2 ).setAccessible ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
		 final String v2 = "mContentInsets"; // const-string v2, "mContentInsets"
		 /* .line 6 */
		 (( java.lang.Class ) v0 ).getDeclaredField ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
		 /* .line 7 */
		 (( java.lang.reflect.Field ) v0 ).setAccessible ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
		 /* .line 8 */
		 c.h.n.g1.d = (v1!= 0);
		 /* :try_end_0 */
		 /* .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 9 */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "Failed to get visible insets from AttachInfo "; // const-string v2, "Failed to get visible insets from AttachInfo "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.ReflectiveOperationException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/ReflectiveOperationException;->getMessage()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 final String v2 = "WindowInsetsCompat"; // const-string v2, "WindowInsetsCompat"
		 android.util.Log .w ( v2,v1,v0 );
	 } // :goto_0
	 return;
} // .end method
public static c.h.n.u1 a ( android.view.View p0 ) {
	 /* .locals 4 */
	 /* .line 1 */
	 /* sget-boolean v0, Lc/h/n/g1;->d:Z */
	 int v1 = 0; // const/4 v1, 0x0
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = 		 (( android.view.View ) p0 ).isAttachedToWindow ( ); // invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 (( android.view.View ) p0 ).getRootView ( ); // invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;
	 /* .line 3 */
	 try { // :try_start_0
		 v2 = c.h.n.g1.a;
		 (( java.lang.reflect.Field ) v2 ).get ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 4 */
			 v2 = c.h.n.g1.b;
			 (( java.lang.reflect.Field ) v2 ).get ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v2, Landroid/graphics/Rect; */
			 /* .line 5 */
			 v3 = c.h.n.g1.c;
			 (( java.lang.reflect.Field ) v3 ).get ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v0, Landroid/graphics/Rect; */
			 if ( v2 != null) { // if-eqz v2, :cond_1
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 /* .line 6 */
					 /* new-instance v3, Lc/h/n/h1; */
					 /* invoke-direct {v3}, Lc/h/n/h1;-><init>()V */
					 /* .line 7 */
					 c.h.g.b .a ( v2 );
					 (( c.h.n.h1 ) v3 ).a ( v2 ); // invoke-virtual {v3, v2}, Lc/h/n/h1;->a(Lc/h/g/b;)Lc/h/n/h1;
					 /* .line 8 */
					 c.h.g.b .a ( v0 );
					 (( c.h.n.h1 ) v3 ).b ( v0 ); // invoke-virtual {v3, v0}, Lc/h/n/h1;->b(Lc/h/g/b;)Lc/h/n/h1;
					 /* .line 9 */
					 (( c.h.n.h1 ) v3 ).a ( ); // invoke-virtual {v3}, Lc/h/n/h1;->a()Lc/h/n/u1;
					 /* .line 10 */
					 (( c.h.n.u1 ) v0 ).a ( v0 ); // invoke-virtual {v0, v0}, Lc/h/n/u1;->a(Lc/h/n/u1;)V
					 /* .line 11 */
					 (( android.view.View ) p0 ).getRootView ( ); // invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;
					 (( c.h.n.u1 ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lc/h/n/u1;->a(Landroid/view/View;)V
					 /* :try_end_0 */
					 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
					 /* :catch_0 */
					 /* move-exception p0 */
					 /* .line 12 */
					 /* new-instance v0, Ljava/lang/StringBuilder; */
					 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
					 final String v2 = "Failed to get insets from AttachInfo."; // const-string v2, "Failed to get insets from AttachInfo."
					 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.IllegalAccessException ) p0 ).getMessage ( ); // invoke-virtual {p0}, Ljava/lang/IllegalAccessException;->getMessage()Ljava/lang/String;
					 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
					 final String v2 = "WindowInsetsCompat"; // const-string v2, "WindowInsetsCompat"
					 android.util.Log .w ( v2,v0,p0 );
				 } // :cond_1
			 } // :goto_0
		 } // .end method
