.class public Le/b/a/y/y/d2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/x0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/y/x0<",
        "Le/b/a/y/y/i0;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/y/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/u0<",
            "Le/b/a/y/y/i0;",
            "Le/b/a/y/y/i0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/b/a/y/y/u0;

    const-wide/16 v1, 0x1f4

    invoke-direct {v0, v1, v2}, Le/b/a/y/y/u0;-><init>(J)V

    iput-object v0, p0, Le/b/a/y/y/d2/a;->a:Le/b/a/y/y/u0;

    return-void
.end method


# virtual methods
.method public a(Le/b/a/y/y/g1;)Le/b/a/y/y/w0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/g1;",
            ")",
            "Le/b/a/y/y/w0<",
            "Le/b/a/y/y/i0;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Le/b/a/y/y/d2/b;

    iget-object v0, p0, Le/b/a/y/y/d2/a;->a:Le/b/a/y/y/u0;

    invoke-direct {p1, v0}, Le/b/a/y/y/d2/b;-><init>(Le/b/a/y/y/u0;)V

    return-object p1
.end method
