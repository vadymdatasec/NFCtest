.class public final enum Lk/e1/k/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk/e1/k/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lk/e1/k/a;

.field public static final enum d:Lk/e1/k/a;

.field public static final enum e:Lk/e1/k/a;

.field public static final enum f:Lk/e1/k/a;

.field public static final enum g:Lk/e1/k/a;

.field public static final enum h:Lk/e1/k/a;

.field public static final enum i:Lk/e1/k/a;

.field public static final enum j:Lk/e1/k/a;

.field public static final enum k:Lk/e1/k/a;

.field public static final enum l:Lk/e1/k/a;

.field public static final enum m:Lk/e1/k/a;

.field public static final synthetic n:[Lk/e1/k/a;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lk/e1/k/a;

    const/4 v1, 0x0

    const-string v2, "NO_ERROR"

    invoke-direct {v0, v2, v1, v1}, Lk/e1/k/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk/e1/k/a;->c:Lk/e1/k/a;

    .line 2
    new-instance v0, Lk/e1/k/a;

    const/4 v2, 0x1

    const-string v3, "PROTOCOL_ERROR"

    invoke-direct {v0, v3, v2, v2}, Lk/e1/k/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk/e1/k/a;->d:Lk/e1/k/a;

    .line 3
    new-instance v0, Lk/e1/k/a;

    const/4 v3, 0x2

    const-string v4, "INTERNAL_ERROR"

    invoke-direct {v0, v4, v3, v3}, Lk/e1/k/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk/e1/k/a;->e:Lk/e1/k/a;

    .line 4
    new-instance v0, Lk/e1/k/a;

    const/4 v4, 0x3

    const-string v5, "FLOW_CONTROL_ERROR"

    invoke-direct {v0, v5, v4, v4}, Lk/e1/k/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk/e1/k/a;->f:Lk/e1/k/a;

    .line 5
    new-instance v0, Lk/e1/k/a;

    const/4 v5, 0x4

    const/4 v6, 0x7

    const-string v7, "REFUSED_STREAM"

    invoke-direct {v0, v7, v5, v6}, Lk/e1/k/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk/e1/k/a;->g:Lk/e1/k/a;

    .line 6
    new-instance v0, Lk/e1/k/a;

    const/4 v7, 0x5

    const/16 v8, 0x8

    const-string v9, "CANCEL"

    invoke-direct {v0, v9, v7, v8}, Lk/e1/k/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk/e1/k/a;->h:Lk/e1/k/a;

    .line 7
    new-instance v0, Lk/e1/k/a;

    const/4 v9, 0x6

    const/16 v10, 0x9

    const-string v11, "COMPRESSION_ERROR"

    invoke-direct {v0, v11, v9, v10}, Lk/e1/k/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk/e1/k/a;->i:Lk/e1/k/a;

    .line 8
    new-instance v0, Lk/e1/k/a;

    const/16 v11, 0xa

    const-string v12, "CONNECT_ERROR"

    invoke-direct {v0, v12, v6, v11}, Lk/e1/k/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk/e1/k/a;->j:Lk/e1/k/a;

    .line 9
    new-instance v0, Lk/e1/k/a;

    const/16 v12, 0xb

    const-string v13, "ENHANCE_YOUR_CALM"

    invoke-direct {v0, v13, v8, v12}, Lk/e1/k/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk/e1/k/a;->k:Lk/e1/k/a;

    .line 10
    new-instance v0, Lk/e1/k/a;

    const-string v13, "INADEQUATE_SECURITY"

    const/16 v14, 0xc

    invoke-direct {v0, v13, v10, v14}, Lk/e1/k/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk/e1/k/a;->l:Lk/e1/k/a;

    .line 11
    new-instance v0, Lk/e1/k/a;

    const-string v13, "HTTP_1_1_REQUIRED"

    const/16 v14, 0xd

    invoke-direct {v0, v13, v11, v14}, Lk/e1/k/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lk/e1/k/a;->m:Lk/e1/k/a;

    new-array v12, v12, [Lk/e1/k/a;

    .line 12
    sget-object v13, Lk/e1/k/a;->c:Lk/e1/k/a;

    aput-object v13, v12, v1

    sget-object v1, Lk/e1/k/a;->d:Lk/e1/k/a;

    aput-object v1, v12, v2

    sget-object v1, Lk/e1/k/a;->e:Lk/e1/k/a;

    aput-object v1, v12, v3

    sget-object v1, Lk/e1/k/a;->f:Lk/e1/k/a;

    aput-object v1, v12, v4

    sget-object v1, Lk/e1/k/a;->g:Lk/e1/k/a;

    aput-object v1, v12, v5

    sget-object v1, Lk/e1/k/a;->h:Lk/e1/k/a;

    aput-object v1, v12, v7

    sget-object v1, Lk/e1/k/a;->i:Lk/e1/k/a;

    aput-object v1, v12, v9

    sget-object v1, Lk/e1/k/a;->j:Lk/e1/k/a;

    aput-object v1, v12, v6

    sget-object v1, Lk/e1/k/a;->k:Lk/e1/k/a;

    aput-object v1, v12, v8

    sget-object v1, Lk/e1/k/a;->l:Lk/e1/k/a;

    aput-object v1, v12, v10

    aput-object v0, v12, v11

    sput-object v12, Lk/e1/k/a;->n:[Lk/e1/k/a;

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

    .line 2
    iput p3, p0, Lk/e1/k/a;->b:I

    return-void
.end method

.method public static a(I)Lk/e1/k/a;
    .locals 5

    .line 1
    invoke-static {}, Lk/e1/k/a;->values()[Lk/e1/k/a;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    iget v4, v3, Lk/e1/k/a;->b:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lk/e1/k/a;
    .locals 1

    .line 1
    const-class v0, Lk/e1/k/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk/e1/k/a;

    return-object p0
.end method

.method public static values()[Lk/e1/k/a;
    .locals 1

    .line 1
    sget-object v0, Lk/e1/k/a;->n:[Lk/e1/k/a;

    invoke-virtual {v0}, [Lk/e1/k/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk/e1/k/a;

    return-object v0
.end method
