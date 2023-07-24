.class public Le/b/a/y/y/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/x0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/y/x0<",
        "[B",
        "Ljava/nio/ByteBuffer;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
            "[B",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Le/b/a/y/y/k;

    new-instance v0, Le/b/a/y/y/e;

    invoke-direct {v0, p0}, Le/b/a/y/y/e;-><init>(Le/b/a/y/y/f;)V

    invoke-direct {p1, v0}, Le/b/a/y/y/k;-><init>(Le/b/a/y/y/g;)V

    return-object p1
.end method
