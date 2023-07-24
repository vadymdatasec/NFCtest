.class public final Le/f/a/d/a/i/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResultT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Le/f/a/d/a/i/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/i/r<",
            "TResultT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Le/f/a/d/a/i/r;

    invoke-direct {v0}, Le/f/a/d/a/i/r;-><init>()V

    iput-object v0, p0, Le/f/a/d/a/i/o;->a:Le/f/a/d/a/i/r;

    return-void
.end method


# virtual methods
.method public final a()Le/f/a/d/a/i/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/d/a/i/d<",
            "TResultT;>;"
        }
    .end annotation

    iget-object v0, p0, Le/f/a/d/a/i/o;->a:Le/f/a/d/a/i/r;

    return-object v0
.end method

.method public final a(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Le/f/a/d/a/i/o;->a:Le/f/a/d/a/i/r;

    invoke-virtual {v0, p1}, Le/f/a/d/a/i/r;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResultT;)V"
        }
    .end annotation

    iget-object v0, p0, Le/f/a/d/a/i/o;->a:Le/f/a/d/a/i/r;

    invoke-virtual {v0, p1}, Le/f/a/d/a/i/r;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Le/f/a/d/a/i/o;->a:Le/f/a/d/a/i/r;

    invoke-virtual {v0, p1}, Le/f/a/d/a/i/r;->b(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResultT;)V"
        }
    .end annotation

    iget-object v0, p0, Le/f/a/d/a/i/o;->a:Le/f/a/d/a/i/r;

    invoke-virtual {v0, p1}, Le/f/a/d/a/i/r;->b(Ljava/lang/Object;)Z

    return-void
.end method
