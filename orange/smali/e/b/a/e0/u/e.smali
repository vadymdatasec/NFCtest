.class public final Le/b/a/e0/u/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/h/m/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lc/h/m/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/e0/u/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/e0/u/d<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Le/b/a/e0/u/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/e0/u/g<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Lc/h/m/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/h/m/d<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc/h/m/d;Le/b/a/e0/u/d;Le/b/a/e0/u/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/h/m/d<",
            "TT;>;",
            "Le/b/a/e0/u/d<",
            "TT;>;",
            "Le/b/a/e0/u/g<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/e0/u/e;->c:Lc/h/m/d;

    .line 3
    iput-object p2, p0, Le/b/a/e0/u/e;->a:Le/b/a/e0/u/d;

    .line 4
    iput-object p3, p0, Le/b/a/e0/u/e;->b:Le/b/a/e0/u/g;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/e0/u/e;->c:Lc/h/m/d;

    invoke-interface {v0}, Lc/h/m/d;->a()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Le/b/a/e0/u/e;->a:Le/b/a/e0/u/d;

    invoke-interface {v0}, Le/b/a/e0/u/d;->a()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    const-string v2, "FactoryPools"

    .line 3
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Created new "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    :cond_0
    instance-of v1, v0, Le/b/a/e0/u/f;

    if-eqz v1, :cond_1

    .line 6
    move-object v1, v0

    check-cast v1, Le/b/a/e0/u/f;

    invoke-interface {v1}, Le/b/a/e0/u/f;->a()Le/b/a/e0/u/l;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Le/b/a/e0/u/l;->a(Z)V

    :cond_1
    return-object v0
.end method

.method public a(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 7
    instance-of v0, p1, Le/b/a/e0/u/f;

    if-eqz v0, :cond_0

    .line 8
    move-object v0, p1

    check-cast v0, Le/b/a/e0/u/f;

    invoke-interface {v0}, Le/b/a/e0/u/f;->a()Le/b/a/e0/u/l;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Le/b/a/e0/u/l;->a(Z)V

    .line 9
    :cond_0
    iget-object v0, p0, Le/b/a/e0/u/e;->b:Le/b/a/e0/u/g;

    invoke-interface {v0, p1}, Le/b/a/e0/u/g;->a(Ljava/lang/Object;)V

    .line 10
    iget-object v0, p0, Le/b/a/e0/u/e;->c:Lc/h/m/d;

    invoke-interface {v0, p1}, Lc/h/m/d;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
