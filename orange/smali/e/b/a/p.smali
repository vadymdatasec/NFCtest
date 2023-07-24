.class public Le/b/a/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/e0/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/e0/k<",
        "Lcom/bumptech/glide/Registry;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Z

.field public final synthetic b:Le/b/a/d;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Le/b/a/a0/a;


# direct methods
.method public constructor <init>(Le/b/a/d;Ljava/util/List;Le/b/a/a0/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/p;->b:Le/b/a/d;

    iput-object p2, p0, Le/b/a/p;->c:Ljava/util/List;

    iput-object p3, p0, Le/b/a/p;->d:Le/b/a/a0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Lcom/bumptech/glide/Registry;
    .locals 4

    .line 2
    iget-boolean v0, p0, Le/b/a/p;->a:Z

    if-nez v0, :cond_0

    const-string v0, "Glide registry"

    .line 3
    invoke-static {v0}, Lc/u/a;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Le/b/a/p;->a:Z

    const/4 v0, 0x0

    .line 5
    :try_start_0
    iget-object v1, p0, Le/b/a/p;->b:Le/b/a/d;

    iget-object v2, p0, Le/b/a/p;->c:Ljava/util/List;

    iget-object v3, p0, Le/b/a/p;->d:Le/b/a/a0/a;

    invoke-static {v1, v2, v3}, Le/b/a/q;->a(Le/b/a/d;Ljava/util/List;Le/b/a/a0/a;)Lcom/bumptech/glide/Registry;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iput-boolean v0, p0, Le/b/a/p;->a:Z

    .line 7
    invoke-static {}, Lc/u/a;->a()V

    return-object v1

    :catchall_0
    move-exception v1

    .line 8
    iput-boolean v0, p0, Le/b/a/p;->a:Z

    .line 9
    invoke-static {}, Lc/u/a;->a()V

    .line 10
    throw v1

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you\'re using the provided Registry rather calling glide.getRegistry()!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/b/a/p;->get()Lcom/bumptech/glide/Registry;

    move-result-object v0

    return-object v0
.end method
