.class public Le/b/a/y/x/q0;
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
.method public a(Ljava/lang/Object;Le/b/a/y/n;IILjava/util/Map;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/r;)Le/b/a/y/x/p0;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Le/b/a/y/n;",
            "II",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Le/b/a/y/v<",
            "*>;>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/x/p0;"
        }
    .end annotation

    .line 1
    new-instance v9, Le/b/a/y/x/p0;

    move-object v0, v9

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Le/b/a/y/x/p0;-><init>(Ljava/lang/Object;Le/b/a/y/n;IILjava/util/Map;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/r;)V

    return-object v9
.end method
