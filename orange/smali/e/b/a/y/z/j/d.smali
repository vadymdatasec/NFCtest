.class public Le/b/a/y/z/j/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/z/j/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/z/j/e<",
        "Le/b/a/y/z/i/f;",
        "[B>;"
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
.method public a(Le/b/a/y/x/y0;Le/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "Le/b/a/y/z/i/f;",
            ">;",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/x/y0<",
            "[B>;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Le/b/a/y/x/y0;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/b/a/y/z/i/f;

    .line 2
    invoke-virtual {p1}, Le/b/a/y/z/i/f;->c()Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 3
    new-instance p2, Le/b/a/y/z/f/c;

    invoke-static {p1}, Le/b/a/e0/c;->c(Ljava/nio/ByteBuffer;)[B

    move-result-object p1

    invoke-direct {p2, p1}, Le/b/a/y/z/f/c;-><init>([B)V

    return-object p2
.end method
