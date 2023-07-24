.class public final enum Le/f/a/a/i/b/n0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/f/a/a/i/b/n0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/f/a/a/i/b/n0;

.field public static final enum c:Le/f/a/a/i/b/n0;

.field public static final enum d:Le/f/a/a/i/b/n0;

.field public static final enum e:Le/f/a/a/i/b/n0;

.field public static final enum f:Le/f/a/a/i/b/n0;

.field public static final enum g:Le/f/a/a/i/b/n0;

.field public static final h:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Le/f/a/a/i/b/n0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Le/f/a/a/i/b/n0;

    const/4 v1, 0x0

    const-string v2, "DEFAULT"

    invoke-direct {v0, v2, v1, v1}, Le/f/a/a/i/b/n0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Le/f/a/a/i/b/n0;->b:Le/f/a/a/i/b/n0;

    .line 2
    new-instance v0, Le/f/a/a/i/b/n0;

    const/4 v2, 0x1

    const-string v3, "UNMETERED_ONLY"

    invoke-direct {v0, v3, v2, v2}, Le/f/a/a/i/b/n0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Le/f/a/a/i/b/n0;->c:Le/f/a/a/i/b/n0;

    .line 3
    new-instance v0, Le/f/a/a/i/b/n0;

    const/4 v3, 0x2

    const-string v4, "UNMETERED_OR_DAILY"

    invoke-direct {v0, v4, v3, v3}, Le/f/a/a/i/b/n0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Le/f/a/a/i/b/n0;->d:Le/f/a/a/i/b/n0;

    .line 4
    new-instance v0, Le/f/a/a/i/b/n0;

    const/4 v4, 0x3

    const-string v5, "FAST_IF_RADIO_AWAKE"

    invoke-direct {v0, v5, v4, v4}, Le/f/a/a/i/b/n0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Le/f/a/a/i/b/n0;->e:Le/f/a/a/i/b/n0;

    .line 5
    new-instance v0, Le/f/a/a/i/b/n0;

    const/4 v5, 0x4

    const-string v6, "NEVER"

    invoke-direct {v0, v6, v5, v5}, Le/f/a/a/i/b/n0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Le/f/a/a/i/b/n0;->f:Le/f/a/a/i/b/n0;

    .line 6
    new-instance v0, Le/f/a/a/i/b/n0;

    const/4 v6, -0x1

    const-string v7, "UNRECOGNIZED"

    const/4 v8, 0x5

    invoke-direct {v0, v7, v8, v6}, Le/f/a/a/i/b/n0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Le/f/a/a/i/b/n0;->g:Le/f/a/a/i/b/n0;

    .line 7
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Le/f/a/a/i/b/n0;->h:Landroid/util/SparseArray;

    .line 8
    sget-object v7, Le/f/a/a/i/b/n0;->b:Le/f/a/a/i/b/n0;

    invoke-virtual {v0, v1, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 9
    sget-object v0, Le/f/a/a/i/b/n0;->h:Landroid/util/SparseArray;

    sget-object v1, Le/f/a/a/i/b/n0;->c:Le/f/a/a/i/b/n0;

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 10
    sget-object v0, Le/f/a/a/i/b/n0;->h:Landroid/util/SparseArray;

    sget-object v1, Le/f/a/a/i/b/n0;->d:Le/f/a/a/i/b/n0;

    invoke-virtual {v0, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 11
    sget-object v0, Le/f/a/a/i/b/n0;->h:Landroid/util/SparseArray;

    sget-object v1, Le/f/a/a/i/b/n0;->e:Le/f/a/a/i/b/n0;

    invoke-virtual {v0, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 12
    sget-object v0, Le/f/a/a/i/b/n0;->h:Landroid/util/SparseArray;

    sget-object v1, Le/f/a/a/i/b/n0;->f:Le/f/a/a/i/b/n0;

    invoke-virtual {v0, v5, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 13
    sget-object v0, Le/f/a/a/i/b/n0;->h:Landroid/util/SparseArray;

    sget-object v1, Le/f/a/a/i/b/n0;->g:Le/f/a/a/i/b/n0;

    invoke-virtual {v0, v6, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method
