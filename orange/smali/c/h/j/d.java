public abstract class c.h.j.d {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* # direct methods */
public static c.h.j.d ( ) {
	 /* .locals 9 */
	 /* .line 1 */
	 /* const-class v0, Ljava/lang/String; */
	 /* const/16 v2, 0x12 */
	 /* if-lt v1, v2, :cond_0 */
	 /* const/16 v2, 0x1d */
	 /* if-ge v1, v2, :cond_0 */
	 /* .line 2 */
	 try { // :try_start_0
		 /* const-class v1, Landroid/os/Trace; */
		 final String v2 = "TRACE_TAG_APP"; // const-string v2, "TRACE_TAG_APP"
		 (( java.lang.Class ) v1 ).getField ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 3 */
		 (( java.lang.reflect.Field ) v1 ).getLong ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J
		 /* .line 4 */
		 /* const-class v1, Landroid/os/Trace; */
		 final String v2 = "isTagEnabled"; // const-string v2, "isTagEnabled"
		 int v3 = 1; // const/4 v3, 0x1
		 /* new-array v4, v3, [Ljava/lang/Class; */
		 v5 = java.lang.Long.TYPE;
		 int v6 = 0; // const/4 v6, 0x0
		 /* aput-object v5, v4, v6 */
		 (( java.lang.Class ) v1 ).getMethod ( v2, v4 ); // invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 /* .line 5 */
		 /* const-class v1, Landroid/os/Trace; */
		 final String v2 = "asyncTraceBegin"; // const-string v2, "asyncTraceBegin"
		 int v4 = 3; // const/4 v4, 0x3
		 /* new-array v5, v4, [Ljava/lang/Class; */
		 v7 = java.lang.Long.TYPE;
		 /* aput-object v7, v5, v6 */
		 /* aput-object v0, v5, v3 */
		 v7 = java.lang.Integer.TYPE;
		 int v8 = 2; // const/4 v8, 0x2
		 /* aput-object v7, v5, v8 */
		 (( java.lang.Class ) v1 ).getMethod ( v2, v5 ); // invoke-virtual {v1, v2, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 /* .line 6 */
		 /* const-class v1, Landroid/os/Trace; */
		 final String v2 = "asyncTraceEnd"; // const-string v2, "asyncTraceEnd"
		 /* new-array v5, v4, [Ljava/lang/Class; */
		 v7 = java.lang.Long.TYPE;
		 /* aput-object v7, v5, v6 */
		 /* aput-object v0, v5, v3 */
		 v7 = java.lang.Integer.TYPE;
		 /* aput-object v7, v5, v8 */
		 (( java.lang.Class ) v1 ).getMethod ( v2, v5 ); // invoke-virtual {v1, v2, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 /* .line 7 */
		 /* const-class v1, Landroid/os/Trace; */
		 final String v2 = "traceCounter"; // const-string v2, "traceCounter"
		 /* new-array v4, v4, [Ljava/lang/Class; */
		 v5 = java.lang.Long.TYPE;
		 /* aput-object v5, v4, v6 */
		 /* aput-object v0, v4, v3 */
		 v0 = java.lang.Integer.TYPE;
		 /* aput-object v0, v4, v8 */
		 (( java.lang.Class ) v1 ).getMethod ( v2, v4 ); // invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 final String v1 = "TraceCompat"; // const-string v1, "TraceCompat"
		 final String v2 = "Unable to initialize via reflection."; // const-string v2, "Unable to initialize via reflection."
		 /* .line 8 */
		 android.util.Log .i ( v1,v2,v0 );
	 } // :cond_0
} // :goto_0
return;
} // .end method
public static void a ( ) {
/* .locals 2 */
/* .line 3 */
/* const/16 v1, 0x12 */
/* if-lt v0, v1, :cond_0 */
/* .line 4 */
android.os.Trace .endSection ( );
} // :cond_0
return;
} // .end method
public static void a ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x12 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
android.os.Trace .beginSection ( p0 );
} // :cond_0
return;
} // .end method
