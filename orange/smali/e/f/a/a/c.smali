.class public abstract Le/f/a/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;)Le/f/a/a/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Le/f/a/a/c<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/f/a/a/a;

    sget-object v1, Le/f/a/a/d;->c:Le/f/a/a/d;

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0, v1}, Le/f/a/a/a;-><init>(Ljava/lang/Integer;Ljava/lang/Object;Le/f/a/a/d;)V

    return-object v0
.end method

.method public static b(Ljava/lang/Object;)Le/f/a/a/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Le/f/a/a/c<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/f/a/a/a;

    sget-object v1, Le/f/a/a/d;->d:Le/f/a/a/d;

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0, v1}, Le/f/a/a/a;-><init>(Ljava/lang/Integer;Ljava/lang/Object;Le/f/a/a/d;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/Integer;
.end method

.method public abstract b()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract c()Le/f/a/a/d;
.end method