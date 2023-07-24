.class public Le/f/c/l/e/q/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/q/a;Ljava/lang/String;Ljava/util/Map;)Le/f/c/l/e/q/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/q/a;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Le/f/c/l/e/q/b;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/f/c/l/e/q/b;

    invoke-direct {v0, p1, p2, p3}, Le/f/c/l/e/q/b;-><init>(Le/f/c/l/e/q/a;Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method
