.class public final Le/b/a/z/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lc/n/g;",
            "Le/b/a/u;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Le/b/a/z/v$a;


# direct methods
.method public constructor <init>(Le/b/a/z/v$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Le/b/a/z/q;->a:Ljava/util/Map;

    .line 3
    iput-object p1, p0, Le/b/a/z/q;->b:Le/b/a/z/v$a;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Le/b/a/d;Lc/n/g;Lc/l/d/o1;Z)Le/b/a/u;
    .locals 3

    .line 3
    invoke-static {}, Le/b/a/e0/t;->b()V

    .line 4
    invoke-virtual {p0, p3}, Le/b/a/z/q;->a(Lc/n/g;)Le/b/a/u;

    move-result-object v0

    if-nez v0, :cond_1

    .line 5
    new-instance v0, Lcom/bumptech/glide/manager/LifecycleLifecycle;

    invoke-direct {v0, p3}, Lcom/bumptech/glide/manager/LifecycleLifecycle;-><init>(Lc/n/g;)V

    .line 6
    iget-object v1, p0, Le/b/a/z/q;->b:Le/b/a/z/v$a;

    new-instance v2, Le/b/a/z/p;

    invoke-direct {v2, p0, p4}, Le/b/a/z/p;-><init>(Le/b/a/z/q;Lc/l/d/o1;)V

    .line 7
    invoke-interface {v1, p2, v0, v2, p1}, Le/b/a/z/v$a;->a(Le/b/a/d;Le/b/a/z/m;Le/b/a/z/w;Landroid/content/Context;)Le/b/a/u;

    move-result-object p1

    .line 8
    iget-object p2, p0, Le/b/a/z/q;->a:Ljava/util/Map;

    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    new-instance p2, Le/b/a/z/o;

    invoke-direct {p2, p0, p3}, Le/b/a/z/o;-><init>(Le/b/a/z/q;Lc/n/g;)V

    invoke-virtual {v0, p2}, Lcom/bumptech/glide/manager/LifecycleLifecycle;->a(Le/b/a/z/n;)V

    if-eqz p5, :cond_0

    .line 10
    invoke-virtual {p1}, Le/b/a/u;->a()V

    :cond_0
    move-object v0, p1

    :cond_1
    return-object v0
.end method

.method public a(Lc/n/g;)Le/b/a/u;
    .locals 1

    .line 1
    invoke-static {}, Le/b/a/e0/t;->b()V

    .line 2
    iget-object v0, p0, Le/b/a/z/q;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/b/a/u;

    return-object p1
.end method
