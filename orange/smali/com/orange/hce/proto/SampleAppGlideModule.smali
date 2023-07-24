.class public final Lcom/orange/hce/proto/SampleAppGlideModule;
.super Le/b/a/a0/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/b/a/a0/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Le/b/a/i;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1, p2}, Le/b/a/a0/a;->a(Landroid/content/Context;Le/b/a/i;)V

    const/4 p1, 0x3

    .line 2
    invoke-virtual {p2, p1}, Le/b/a/i;->a(I)Le/b/a/i;

    return-void
.end method

.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
