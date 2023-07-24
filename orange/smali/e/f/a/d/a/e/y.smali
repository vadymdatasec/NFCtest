.class public final Le/f/a/d/a/e/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/e/a0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/f/a/d/a/e/a0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Le/f/a/d/a/e/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/a0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Le/f/a/d/a/e/a0;Le/f/a/d/a/e/a0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/a/d/a/e/a0<",
            "TT;>;",
            "Le/f/a/d/a/e/a0<",
            "TT;>;)V"
        }
    .end annotation

    invoke-static {p1}, Le/f/a/d/a/e/m;->a(Ljava/lang/Object;)V

    check-cast p0, Le/f/a/d/a/e/y;

    iget-object v0, p0, Le/f/a/d/a/e/y;->a:Le/f/a/d/a/e/a0;

    if-nez v0, :cond_0

    iput-object p1, p0, Le/f/a/d/a/e/y;->a:Le/f/a/d/a/e/a0;

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Le/f/a/d/a/e/y;->a:Le/f/a/d/a/e/a0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Le/f/a/d/a/e/a0;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
