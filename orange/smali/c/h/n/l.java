public abstract class c.h.n.l {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.reflect.Field a;
	 public static Boolean b;
	 /* # direct methods */
	 public static void a ( android.view.LayoutInflater p0, android.view.LayoutInflater$Factory2 p1 ) {
		 /* .locals 6 */
		 /* .line 1 */
		 /* sget-boolean v0, Lc/h/n/l;->b:Z */
		 final String v1 = "; inflation may have unexpected results."; // const-string v1, "; inflation may have unexpected results."
		 final String v2 = "LayoutInflaterCompatHC"; // const-string v2, "LayoutInflaterCompatHC"
		 /* if-nez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 try { // :try_start_0
			 /* const-class v3, Landroid/view/LayoutInflater; */
			 final String v4 = "mFactory2"; // const-string v4, "mFactory2"
			 (( java.lang.Class ) v3 ).getDeclaredField ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 /* .line 3 */
			 (( java.lang.reflect.Field ) v3 ).setAccessible ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NoSuchFieldException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v3 */
			 /* .line 4 */
			 /* new-instance v4, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v5 = "forceSetFactory2 Could not find field \'mFactory2\' on class "; // const-string v5, "forceSetFactory2 Could not find field \'mFactory2\' on class "
			 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 /* const-class v5, Landroid/view/LayoutInflater; */
			 /* .line 5 */
			 (( java.lang.Class ) v5 ).getName ( ); // invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* .line 6 */
			 android.util.Log .e ( v2,v4,v3 );
			 /* .line 7 */
		 } // :goto_0
		 c.h.n.l.b = (v0!= 0);
		 /* .line 8 */
	 } // :cond_0
	 v0 = c.h.n.l.a;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 9 */
		 try { // :try_start_1
			 (( java.lang.reflect.Field ) v0 ).set ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
			 /* :try_end_1 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_1 */
			 /* :catch_1 */
			 /* move-exception p1 */
			 /* .line 10 */
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v3 = "forceSetFactory2 could not set the Factory2 on LayoutInflater "; // const-string v3, "forceSetFactory2 could not set the Factory2 on LayoutInflater "
			 (( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.util.Log .e ( v2,p0,p1 );
		 } // :cond_1
	 } // :goto_1
	 return;
} // .end method
public static void b ( android.view.LayoutInflater p0, android.view.LayoutInflater$Factory2 p1 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 (( android.view.LayoutInflater ) p0 ).setFactory2 ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V
	 /* .line 2 */
	 /* const/16 v1, 0x15 */
	 /* if-ge v0, v1, :cond_1 */
	 /* .line 3 */
	 (( android.view.LayoutInflater ) p0 ).getFactory ( ); // invoke-virtual {p0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;
	 /* .line 4 */
	 /* instance-of v1, v0, Landroid/view/LayoutInflater$Factory2; */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 5 */
		 /* check-cast v0, Landroid/view/LayoutInflater$Factory2; */
		 c.h.n.l .a ( p0,v0 );
		 /* .line 6 */
	 } // :cond_0
	 c.h.n.l .a ( p0,p1 );
} // :cond_1
} // :goto_0
return;
} // .end method
