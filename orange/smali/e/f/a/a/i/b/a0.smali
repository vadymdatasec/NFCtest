.class public abstract Le/f/a/a/i/b/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;)Le/f/a/a/i/b/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/f/a/a/i/b/h0;",
            ">;)",
            "Le/f/a/a/i/b/a0;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/f/a/a/i/b/m;

    invoke-direct {v0, p0}, Le/f/a/a/i/b/m;-><init>(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le/f/a/a/i/b/h0;",
            ">;"
        }
    .end annotation
.end method
