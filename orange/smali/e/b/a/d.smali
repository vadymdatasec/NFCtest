.class public Le/b/a/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# static fields
.field public static volatile i:Le/b/a/d;

.field public static volatile j:Z


# instance fields
.field public final b:Le/b/a/y/x/f1/g;

.field public final c:Le/b/a/y/x/g1/o;

.field public final d:Le/b/a/j;

.field public final e:Le/b/a/y/x/f1/b;

.field public final f:Le/b/a/z/v;

.field public final g:Le/b/a/z/e;

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/b/a/u;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Le/b/a/y/x/j0;Le/b/a/y/x/g1/o;Le/b/a/y/x/f1/g;Le/b/a/y/x/f1/b;Le/b/a/z/v;Le/b/a/z/e;ILe/b/a/c;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Le/b/a/a0/a;Le/b/a/l;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Le/b/a/y/x/j0;",
            "Le/b/a/y/x/g1/o;",
            "Le/b/a/y/x/f1/g;",
            "Le/b/a/y/x/f1/b;",
            "Le/b/a/z/v;",
            "Le/b/a/z/e;",
            "I",
            "Le/b/a/c;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Le/b/a/v<",
            "**>;>;",
            "Ljava/util/List<",
            "Le/b/a/c0/i<",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/util/List<",
            "Le/b/a/a0/c;",
            ">;",
            "Le/b/a/a0/a;",
            "Le/b/a/l;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Le/b/a/d;->h:Ljava/util/List;

    .line 3
    sget-object v1, Le/b/a/m;->c:Le/b/a/m;

    move-object/from16 v2, p4

    .line 4
    iput-object v2, v0, Le/b/a/d;->b:Le/b/a/y/x/f1/g;

    move-object/from16 v1, p5

    .line 5
    iput-object v1, v0, Le/b/a/d;->e:Le/b/a/y/x/f1/b;

    move-object/from16 v2, p3

    .line 6
    iput-object v2, v0, Le/b/a/d;->c:Le/b/a/y/x/g1/o;

    move-object/from16 v2, p6

    .line 7
    iput-object v2, v0, Le/b/a/d;->f:Le/b/a/z/v;

    move-object/from16 v2, p7

    .line 8
    iput-object v2, v0, Le/b/a/d;->g:Le/b/a/z/e;

    move-object/from16 v2, p12

    move-object/from16 v3, p13

    .line 9
    invoke-static {p0, v2, v3}, Le/b/a/q;->b(Le/b/a/d;Ljava/util/List;Le/b/a/a0/a;)Le/b/a/e0/k;

    move-result-object v5

    .line 10
    new-instance v6, Le/b/a/c0/o/f;

    invoke-direct {v6}, Le/b/a/c0/o/f;-><init>()V

    .line 11
    new-instance v13, Le/b/a/j;

    move-object v2, v13

    move-object v3, p1

    move-object/from16 v4, p5

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p2

    move-object/from16 v11, p14

    move/from16 v12, p8

    invoke-direct/range {v2 .. v12}, Le/b/a/j;-><init>(Landroid/content/Context;Le/b/a/y/x/f1/b;Le/b/a/e0/k;Le/b/a/c0/o/f;Le/b/a/c;Ljava/util/Map;Ljava/util/List;Le/b/a/y/x/j0;Le/b/a/l;I)V

    iput-object v13, v0, Le/b/a/d;->d:Le/b/a/j;

    return-void
.end method

.method public static a(Landroid/content/Context;)Le/b/a/d;
    .locals 3

    .line 1
    sget-object v0, Le/b/a/d;->i:Le/b/a/d;

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Le/b/a/d;->b(Landroid/content/Context;)Lcom/bumptech/glide/GeneratedAppGlideModule;

    move-result-object v0

    .line 3
    const-class v1, Le/b/a/d;

    monitor-enter v1

    .line 4
    :try_start_0
    sget-object v2, Le/b/a/d;->i:Le/b/a/d;

    if-nez v2, :cond_0

    .line 5
    invoke-static {p0, v0}, Le/b/a/d;->a(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V

    .line 6
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 7
    :cond_1
    :goto_0
    sget-object p0, Le/b/a/d;->i:Le/b/a/d;

    return-object p0
.end method

.method public static a(Landroid/view/View;)Le/b/a/u;
    .locals 1

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Le/b/a/d;->c(Landroid/content/Context;)Le/b/a/z/v;

    move-result-object v0

    invoke-virtual {v0, p0}, Le/b/a/z/v;->a(Landroid/view/View;)Le/b/a/u;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 1

    .line 8
    sget-boolean v0, Le/b/a/d;->j:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 9
    sput-boolean v0, Le/b/a/d;->j:Z

    const/4 v0, 0x0

    .line 10
    :try_start_0
    invoke-static {p0, p1}, Le/b/a/d;->b(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    sput-boolean v0, Le/b/a/d;->j:Z

    return-void

    :catchall_0
    move-exception p0

    sput-boolean v0, Le/b/a/d;->j:Z

    .line 12
    throw p0

    .line 13
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Glide has been called recursively, this is probably an internal library error!"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a(Landroid/content/Context;Le/b/a/i;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 8

    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 15
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    if-eqz p2, :cond_0

    .line 16
    invoke-virtual {p2}, Le/b/a/a0/a;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 17
    :cond_0
    new-instance v0, Le/b/a/a0/e;

    invoke-direct {v0, p0}, Le/b/a/a0/e;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Le/b/a/a0/e;->b()Ljava/util/List;

    move-result-object v0

    :cond_1
    const/4 v1, 0x3

    const-string v2, "Glide"

    if-eqz p2, :cond_4

    .line 18
    invoke-virtual {p2}, Lcom/bumptech/glide/GeneratedAppGlideModule;->b()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    .line 19
    invoke-virtual {p2}, Lcom/bumptech/glide/GeneratedAppGlideModule;->b()Ljava/util/Set;

    move-result-object v3

    .line 20
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 21
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 22
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le/b/a/a0/c;

    .line 23
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_0

    .line 24
    :cond_2
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 25
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "AppGlideModule excludes manifest GlideModule: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 27
    :cond_4
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 28
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/b/a/a0/c;

    .line 29
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Discovered GlideModule from manifest: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_5
    if-eqz p2, :cond_6

    .line 30
    invoke-virtual {p2}, Lcom/bumptech/glide/GeneratedAppGlideModule;->c()Le/b/a/z/v$a;

    move-result-object v1

    goto :goto_2

    :cond_6
    const/4 v1, 0x0

    .line 31
    :goto_2
    invoke-virtual {p1, v1}, Le/b/a/i;->a(Le/b/a/z/v$a;)V

    .line 32
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/b/a/a0/c;

    .line 33
    invoke-interface {v2, p0, p1}, Le/b/a/a0/b;->a(Landroid/content/Context;Le/b/a/i;)V

    goto :goto_3

    :cond_7
    if-eqz p2, :cond_8

    .line 34
    invoke-virtual {p2, p0, p1}, Le/b/a/a0/a;->a(Landroid/content/Context;Le/b/a/i;)V

    .line 35
    :cond_8
    invoke-virtual {p1, p0, v0, p2}, Le/b/a/i;->a(Landroid/content/Context;Ljava/util/List;Le/b/a/a0/a;)Le/b/a/d;

    move-result-object p1

    .line 36
    invoke-virtual {p0, p1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 37
    sput-object p1, Le/b/a/d;->i:Le/b/a/d;

    return-void
.end method

.method public static a(Ljava/lang/Exception;)V
    .locals 2

    .line 38
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static b(Landroid/content/Context;)Lcom/bumptech/glide/GeneratedAppGlideModule;
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.bumptech.glide.GeneratedAppGlideModuleImpl"

    .line 2
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Class;

    .line 3
    const-class v4, Landroid/content/Context;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 4
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    aput-object p0, v2, v5

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/bumptech/glide/GeneratedAppGlideModule;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, p0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 5
    invoke-static {p0}, Le/b/a/d;->a(Ljava/lang/Exception;)V

    throw v0

    :catch_1
    move-exception p0

    .line 6
    invoke-static {p0}, Le/b/a/d;->a(Ljava/lang/Exception;)V

    throw v0

    :catch_2
    move-exception p0

    .line 7
    invoke-static {p0}, Le/b/a/d;->a(Ljava/lang/Exception;)V

    throw v0

    :catch_3
    move-exception p0

    .line 8
    invoke-static {p0}, Le/b/a/d;->a(Ljava/lang/Exception;)V

    throw v0

    :catch_4
    nop

    const/4 p0, 0x5

    const-string v1, "Glide"

    .line 9
    invoke-static {v1, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"

    .line 10
    invoke-static {v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    return-object v0
.end method

.method public static b(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/i;

    invoke-direct {v0}, Le/b/a/i;-><init>()V

    invoke-static {p0, v0, p1}, Le/b/a/d;->a(Landroid/content/Context;Le/b/a/i;Lcom/bumptech/glide/GeneratedAppGlideModule;)V

    return-void
.end method

.method public static c(Landroid/content/Context;)Le/b/a/z/v;
    .locals 1

    const-string v0, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."

    .line 2
    invoke-static {p0, v0}, Le/b/a/e0/r;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 3
    invoke-static {p0}, Le/b/a/d;->a(Landroid/content/Context;)Le/b/a/d;

    move-result-object p0

    invoke-virtual {p0}, Le/b/a/d;->h()Le/b/a/z/v;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/content/Context;)Le/b/a/u;
    .locals 1

    .line 2
    invoke-static {p0}, Le/b/a/d;->c(Landroid/content/Context;)Le/b/a/z/v;

    move-result-object v0

    invoke-virtual {v0, p0}, Le/b/a/z/v;->a(Landroid/content/Context;)Le/b/a/u;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 39
    invoke-static {}, Le/b/a/e0/t;->b()V

    .line 40
    iget-object v0, p0, Le/b/a/d;->c:Le/b/a/y/x/g1/o;

    invoke-interface {v0}, Le/b/a/y/x/g1/o;->a()V

    .line 41
    iget-object v0, p0, Le/b/a/d;->b:Le/b/a/y/x/f1/g;

    invoke-interface {v0}, Le/b/a/y/x/f1/g;->a()V

    .line 42
    iget-object v0, p0, Le/b/a/d;->e:Le/b/a/y/x/f1/b;

    invoke-interface {v0}, Le/b/a/y/x/f1/b;->a()V

    return-void
.end method

.method public a(I)V
    .locals 3

    .line 43
    invoke-static {}, Le/b/a/e0/t;->b()V

    .line 44
    iget-object v0, p0, Le/b/a/d;->h:Ljava/util/List;

    monitor-enter v0

    .line 45
    :try_start_0
    iget-object v1, p0, Le/b/a/d;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/b/a/u;

    .line 46
    invoke-virtual {v2, p1}, Le/b/a/u;->onTrimMemory(I)V

    goto :goto_0

    .line 47
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    iget-object v0, p0, Le/b/a/d;->c:Le/b/a/y/x/g1/o;

    invoke-interface {v0, p1}, Le/b/a/y/x/g1/o;->a(I)V

    .line 49
    iget-object v0, p0, Le/b/a/d;->b:Le/b/a/y/x/f1/g;

    invoke-interface {v0, p1}, Le/b/a/y/x/f1/g;->a(I)V

    .line 50
    iget-object v0, p0, Le/b/a/d;->e:Le/b/a/y/x/f1/b;

    invoke-interface {v0, p1}, Le/b/a/y/x/f1/b;->a(I)V

    return-void

    :catchall_0
    move-exception p1

    .line 51
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public a(Le/b/a/u;)V
    .locals 2

    .line 58
    iget-object v0, p0, Le/b/a/d;->h:Ljava/util/List;

    monitor-enter v0

    .line 59
    :try_start_0
    iget-object v1, p0, Le/b/a/d;->h:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 60
    iget-object v1, p0, Le/b/a/d;->h:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    monitor-exit v0

    return-void

    .line 62
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot register already registered manager"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 63
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Le/b/a/c0/o/h;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/c0/o/h<",
            "*>;)Z"
        }
    .end annotation

    .line 53
    iget-object v0, p0, Le/b/a/d;->h:Ljava/util/List;

    monitor-enter v0

    .line 54
    :try_start_0
    iget-object v1, p0, Le/b/a/d;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/b/a/u;

    .line 55
    invoke-virtual {v2, p1}, Le/b/a/u;->b(Le/b/a/c0/o/h;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    .line 56
    monitor-exit v0

    return p1

    .line 57
    :cond_1
    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b()Le/b/a/y/x/f1/b;
    .locals 1

    .line 11
    iget-object v0, p0, Le/b/a/d;->e:Le/b/a/y/x/f1/b;

    return-object v0
.end method

.method public b(Le/b/a/u;)V
    .locals 2

    .line 12
    iget-object v0, p0, Le/b/a/d;->h:Ljava/util/List;

    monitor-enter v0

    .line 13
    :try_start_0
    iget-object v1, p0, Le/b/a/d;->h:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 14
    iget-object v1, p0, Le/b/a/d;->h:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 15
    monitor-exit v0

    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot unregister not yet registered manager"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c()Le/b/a/y/x/f1/g;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/d;->b:Le/b/a/y/x/f1/g;

    return-object v0
.end method

.method public d()Le/b/a/z/e;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/d;->g:Le/b/a/z/e;

    return-object v0
.end method

.method public e()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/d;->d:Le/b/a/j;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public f()Le/b/a/j;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/d;->d:Le/b/a/j;

    return-object v0
.end method

.method public g()Lcom/bumptech/glide/Registry;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/d;->d:Le/b/a/j;

    invoke-virtual {v0}, Le/b/a/j;->g()Lcom/bumptech/glide/Registry;

    move-result-object v0

    return-object v0
.end method

.method public h()Le/b/a/z/v;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/d;->f:Le/b/a/z/v;

    return-object v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public onLowMemory()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le/b/a/d;->a()V

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/b/a/d;->a(I)V

    return-void
.end method
