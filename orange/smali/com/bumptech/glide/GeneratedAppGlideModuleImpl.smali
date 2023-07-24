.class public final Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;
.super Lcom/bumptech/glide/GeneratedAppGlideModule;
.source "SourceFile"


# instance fields
.field public final a:Lcom/orange/hce/proto/SampleAppGlideModule;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/bumptech/glide/GeneratedAppGlideModule;-><init>()V

    .line 2
    new-instance p1, Lcom/orange/hce/proto/SampleAppGlideModule;

    invoke-direct {p1}, Lcom/orange/hce/proto/SampleAppGlideModule;-><init>()V

    iput-object p1, p0, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->a:Lcom/orange/hce/proto/SampleAppGlideModule;

    const-string p1, "Glide"

    const/4 v0, 0x3

    .line 3
    invoke-static {p1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Discovered AppGlideModule from annotation: com.orange.hce.proto.SampleAppGlideModule"

    .line 4
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "Discovered LibraryGlideModule from annotation: ch.qoqa.glide.svg.SvgLibraryGlideModule"

    .line 5
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Le/b/a/d;Lcom/bumptech/glide/Registry;)V
    .locals 1

    .line 2
    new-instance v0, Ld/a/a/a/d;

    invoke-direct {v0}, Ld/a/a/a/d;-><init>()V

    invoke-virtual {v0, p1, p2, p3}, Ld/a/a/a/d;->a(Landroid/content/Context;Le/b/a/d;Lcom/bumptech/glide/Registry;)V

    .line 3
    iget-object v0, p0, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->a:Lcom/orange/hce/proto/SampleAppGlideModule;

    invoke-virtual {v0, p1, p2, p3}, Le/b/a/a0/d;->a(Landroid/content/Context;Le/b/a/d;Lcom/bumptech/glide/Registry;)V

    return-void
.end method

.method public a(Landroid/content/Context;Le/b/a/i;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->a:Lcom/orange/hce/proto/SampleAppGlideModule;

    invoke-virtual {v0, p1, p2}, Lcom/orange/hce/proto/SampleAppGlideModule;->a(Landroid/content/Context;Le/b/a/i;)V

    return-void
.end method

.method public a()Z
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->a:Lcom/orange/hce/proto/SampleAppGlideModule;

    invoke-virtual {v0}, Lcom/orange/hce/proto/SampleAppGlideModule;->a()Z

    move-result v0

    return v0
.end method

.method public b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public c()Le/b/a/a;
    .locals 1

    .line 2
    new-instance v0, Le/b/a/a;

    invoke-direct {v0}, Le/b/a/a;-><init>()V

    return-object v0
.end method

.method public bridge synthetic c()Le/b/a/z/v$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->c()Le/b/a/a;

    move-result-object v0

    return-object v0
.end method
