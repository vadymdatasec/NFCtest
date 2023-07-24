.class public abstract Le/h/d/a/a/v/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "A:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Li/h/b/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li/h/b/l<",
            "-TA;+TT;>;"
        }
    .end annotation
.end field

.field public volatile b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Li/h/b/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/h/b/l<",
            "-TA;+TT;>;)V"
        }
    .end annotation

    const-string v0, "creator"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/v/g;->a:Li/h/b/l;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/h/d/a/a/v/g;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Le/h/d/a/a/v/g;->b:Ljava/lang/Object;

    if-eqz v0, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Le/h/d/a/a/v/g;->a:Li/h/b/l;

    invoke-static {v0}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Li/h/b/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 5
    iput-object v0, p0, Le/h/d/a/a/v/g;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Le/h/d/a/a/v/g;->a:Li/h/b/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :goto_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
