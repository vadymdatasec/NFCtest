.class public final Le/h/d/a/a/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Li/h/c/g;)V
    .locals 0

    invoke-direct {p0}, Le/h/d/a/a/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Le/h/d/a/a/h;
    .locals 2

    .line 1
    invoke-static {}, Le/h/d/a/a/h;->a()Le/h/d/a/a/h;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Le/h/d/a/a/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/h/d/a/a/h;-><init>(Li/h/c/g;)V

    invoke-static {v0}, Le/h/d/a/a/h;->a(Le/h/d/a/a/h;)V

    .line 3
    :cond_0
    invoke-static {}, Le/h/d/a/a/h;->a()Le/h/d/a/a/h;

    move-result-object v0

    invoke-static {v0}, Li/h/c/k;->a(Ljava/lang/Object;)V

    return-object v0
.end method
