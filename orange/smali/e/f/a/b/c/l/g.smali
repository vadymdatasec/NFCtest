.class public final Le/f/a/b/c/l/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Le/f/a/b/c/l/a;Le/f/a/b/c/l/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Le/f/a/b/c/l/e;",
            ">(",
            "Ljava/lang/String;",
            "Le/f/a/b/c/l/a<",
            "TC;TO;>;",
            "Le/f/a/b/c/l/f<",
            "TC;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "Cannot construct an Api with a null ClientBuilder"

    .line 2
    invoke-static {p2, p1}, Le/f/a/b/c/m/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "Cannot construct an Api with a null ClientKey"

    .line 3
    invoke-static {p3, p1}, Le/f/a/b/c/m/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
