.class public final Lc/l/d/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "BanParcelableUsage"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc/l/d/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:[I

.field public final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final d:[I

.field public final e:[I

.field public final f:I

.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:I

.field public final j:Ljava/lang/CharSequence;

.field public final k:I

.field public final l:Ljava/lang/CharSequence;

.field public final m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc/l/d/b;

    invoke-direct {v0}, Lc/l/d/b;-><init>()V

    sput-object v0, Lc/l/d/c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Lc/l/d/c;->b:[I

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lc/l/d/c;->c:Ljava/util/ArrayList;

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Lc/l/d/c;->d:[I

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Lc/l/d/c;->e:[I

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/l/d/c;->f:I

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lc/l/d/c;->g:Ljava/lang/String;

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/l/d/c;->h:I

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/l/d/c;->i:I

    .line 37
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Lc/l/d/c;->j:Ljava/lang/CharSequence;

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lc/l/d/c;->k:I

    .line 39
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Lc/l/d/c;->l:Ljava/lang/CharSequence;

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lc/l/d/c;->m:Ljava/util/ArrayList;

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lc/l/d/c;->n:Ljava/util/ArrayList;

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lc/l/d/c;->o:Z

    return-void
.end method

.method public constructor <init>(Lc/l/d/a;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v1, v0, 0x5

    .line 3
    new-array v1, v1, [I

    iput-object v1, p0, Lc/l/d/c;->b:[I

    .line 4
    iget-boolean v1, p1, Lc/l/d/e2;->g:Z

    if-eqz v1, :cond_2

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lc/l/d/c;->c:Ljava/util/ArrayList;

    .line 6
    new-array v1, v0, [I

    iput-object v1, p0, Lc/l/d/c;->d:[I

    .line 7
    new-array v1, v0, [I

    iput-object v1, p0, Lc/l/d/c;->e:[I

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 8
    iget-object v3, p1, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/l/d/d2;

    .line 9
    iget-object v4, p0, Lc/l/d/c;->b:[I

    add-int/lit8 v5, v2, 0x1

    iget v6, v3, Lc/l/d/d2;->a:I

    aput v6, v4, v2

    .line 10
    iget-object v2, p0, Lc/l/d/c;->c:Ljava/util/ArrayList;

    iget-object v4, v3, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    if-eqz v4, :cond_0

    iget-object v4, v4, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    iget-object v2, p0, Lc/l/d/c;->b:[I

    add-int/lit8 v4, v5, 0x1

    iget v6, v3, Lc/l/d/d2;->c:I

    aput v6, v2, v5

    add-int/lit8 v5, v4, 0x1

    .line 12
    iget v6, v3, Lc/l/d/d2;->d:I

    aput v6, v2, v4

    add-int/lit8 v4, v5, 0x1

    .line 13
    iget v6, v3, Lc/l/d/d2;->e:I

    aput v6, v2, v5

    add-int/lit8 v5, v4, 0x1

    .line 14
    iget v6, v3, Lc/l/d/d2;->f:I

    aput v6, v2, v4

    .line 15
    iget-object v2, p0, Lc/l/d/c;->d:[I

    iget-object v4, v3, Lc/l/d/d2;->g:Lc/n/g$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v4, v2, v1

    .line 16
    iget-object v2, p0, Lc/l/d/c;->e:[I

    iget-object v3, v3, Lc/l/d/d2;->h:Lc/n/g$b;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    move v2, v5

    goto :goto_0

    .line 17
    :cond_1
    iget v0, p1, Lc/l/d/e2;->f:I

    iput v0, p0, Lc/l/d/c;->f:I

    .line 18
    iget-object v0, p1, Lc/l/d/e2;->h:Ljava/lang/String;

    iput-object v0, p0, Lc/l/d/c;->g:Ljava/lang/String;

    .line 19
    iget v0, p1, Lc/l/d/a;->s:I

    iput v0, p0, Lc/l/d/c;->h:I

    .line 20
    iget v0, p1, Lc/l/d/e2;->i:I

    iput v0, p0, Lc/l/d/c;->i:I

    .line 21
    iget-object v0, p1, Lc/l/d/e2;->j:Ljava/lang/CharSequence;

    iput-object v0, p0, Lc/l/d/c;->j:Ljava/lang/CharSequence;

    .line 22
    iget v0, p1, Lc/l/d/e2;->k:I

    iput v0, p0, Lc/l/d/c;->k:I

    .line 23
    iget-object v0, p1, Lc/l/d/e2;->l:Ljava/lang/CharSequence;

    iput-object v0, p0, Lc/l/d/c;->l:Ljava/lang/CharSequence;

    .line 24
    iget-object v0, p1, Lc/l/d/e2;->m:Ljava/util/ArrayList;

    iput-object v0, p0, Lc/l/d/c;->m:Ljava/util/ArrayList;

    .line 25
    iget-object v0, p1, Lc/l/d/e2;->n:Ljava/util/ArrayList;

    iput-object v0, p0, Lc/l/d/c;->n:Ljava/util/ArrayList;

    .line 26
    iget-boolean p1, p1, Lc/l/d/e2;->o:Z

    iput-boolean p1, p0, Lc/l/d/c;->o:Z

    return-void

    .line 27
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Not on back stack"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(Lc/l/d/o1;)Lc/l/d/a;
    .locals 9

    .line 1
    new-instance v0, Lc/l/d/a;

    invoke-direct {v0, p1}, Lc/l/d/a;-><init>(Lc/l/d/o1;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 2
    :goto_0
    iget-object v3, p0, Lc/l/d/c;->b:[I

    array-length v3, v3

    if-ge v1, v3, :cond_2

    .line 3
    new-instance v3, Lc/l/d/d2;

    invoke-direct {v3}, Lc/l/d/d2;-><init>()V

    .line 4
    iget-object v4, p0, Lc/l/d/c;->b:[I

    add-int/lit8 v5, v1, 0x1

    aget v1, v4, v1

    iput v1, v3, Lc/l/d/d2;->a:I

    const/4 v1, 0x2

    .line 5
    invoke-static {v1}, Lc/l/d/o1;->d(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Instantiate "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " op #"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " base fragment #"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lc/l/d/c;->b:[I

    aget v4, v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v4, "FragmentManager"

    invoke-static {v4, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    :cond_0
    iget-object v1, p0, Lc/l/d/c;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {p1, v1}, Lc/l/d/o1;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    .line 9
    iput-object v1, v3, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 10
    iput-object v1, v3, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    .line 11
    :goto_1
    invoke-static {}, Lc/n/g$b;->values()[Lc/n/g$b;

    move-result-object v1

    iget-object v4, p0, Lc/l/d/c;->d:[I

    aget v4, v4, v2

    aget-object v1, v1, v4

    iput-object v1, v3, Lc/l/d/d2;->g:Lc/n/g$b;

    .line 12
    invoke-static {}, Lc/n/g$b;->values()[Lc/n/g$b;

    move-result-object v1

    iget-object v4, p0, Lc/l/d/c;->e:[I

    aget v4, v4, v2

    aget-object v1, v1, v4

    iput-object v1, v3, Lc/l/d/d2;->h:Lc/n/g$b;

    .line 13
    iget-object v1, p0, Lc/l/d/c;->b:[I

    add-int/lit8 v4, v5, 0x1

    aget v5, v1, v5

    iput v5, v3, Lc/l/d/d2;->c:I

    add-int/lit8 v6, v4, 0x1

    .line 14
    aget v4, v1, v4

    iput v4, v3, Lc/l/d/d2;->d:I

    add-int/lit8 v7, v6, 0x1

    .line 15
    aget v6, v1, v6

    iput v6, v3, Lc/l/d/d2;->e:I

    add-int/lit8 v8, v7, 0x1

    .line 16
    aget v1, v1, v7

    iput v1, v3, Lc/l/d/d2;->f:I

    .line 17
    iput v5, v0, Lc/l/d/e2;->b:I

    .line 18
    iput v4, v0, Lc/l/d/e2;->c:I

    .line 19
    iput v6, v0, Lc/l/d/e2;->d:I

    .line 20
    iput v1, v0, Lc/l/d/e2;->e:I

    .line 21
    invoke-virtual {v0, v3}, Lc/l/d/e2;->a(Lc/l/d/d2;)V

    add-int/lit8 v2, v2, 0x1

    move v1, v8

    goto/16 :goto_0

    .line 22
    :cond_2
    iget p1, p0, Lc/l/d/c;->f:I

    iput p1, v0, Lc/l/d/e2;->f:I

    .line 23
    iget-object p1, p0, Lc/l/d/c;->g:Ljava/lang/String;

    iput-object p1, v0, Lc/l/d/e2;->h:Ljava/lang/String;

    .line 24
    iget p1, p0, Lc/l/d/c;->h:I

    iput p1, v0, Lc/l/d/a;->s:I

    const/4 p1, 0x1

    .line 25
    iput-boolean p1, v0, Lc/l/d/e2;->g:Z

    .line 26
    iget v1, p0, Lc/l/d/c;->i:I

    iput v1, v0, Lc/l/d/e2;->i:I

    .line 27
    iget-object v1, p0, Lc/l/d/c;->j:Ljava/lang/CharSequence;

    iput-object v1, v0, Lc/l/d/e2;->j:Ljava/lang/CharSequence;

    .line 28
    iget v1, p0, Lc/l/d/c;->k:I

    iput v1, v0, Lc/l/d/e2;->k:I

    .line 29
    iget-object v1, p0, Lc/l/d/c;->l:Ljava/lang/CharSequence;

    iput-object v1, v0, Lc/l/d/e2;->l:Ljava/lang/CharSequence;

    .line 30
    iget-object v1, p0, Lc/l/d/c;->m:Ljava/util/ArrayList;

    iput-object v1, v0, Lc/l/d/e2;->m:Ljava/util/ArrayList;

    .line 31
    iget-object v1, p0, Lc/l/d/c;->n:Ljava/util/ArrayList;

    iput-object v1, v0, Lc/l/d/e2;->n:Ljava/util/ArrayList;

    .line 32
    iget-boolean v1, p0, Lc/l/d/c;->o:Z

    iput-boolean v1, v0, Lc/l/d/e2;->o:Z

    .line 33
    invoke-virtual {v0, p1}, Lc/l/d/a;->a(I)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    iget-object p2, p0, Lc/l/d/c;->b:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 2
    iget-object p2, p0, Lc/l/d/c;->c:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 3
    iget-object p2, p0, Lc/l/d/c;->d:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 4
    iget-object p2, p0, Lc/l/d/c;->e:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 5
    iget p2, p0, Lc/l/d/c;->f:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 6
    iget-object p2, p0, Lc/l/d/c;->g:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 7
    iget p2, p0, Lc/l/d/c;->h:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 8
    iget p2, p0, Lc/l/d/c;->i:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    iget-object p2, p0, Lc/l/d/c;->j:Ljava/lang/CharSequence;

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 10
    iget p2, p0, Lc/l/d/c;->k:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 11
    iget-object p2, p0, Lc/l/d/c;->l:Ljava/lang/CharSequence;

    invoke-static {p2, p1, v0}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 12
    iget-object p2, p0, Lc/l/d/c;->m:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 13
    iget-object p2, p0, Lc/l/d/c;->n:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 14
    iget-boolean p2, p0, Lc/l/d/c;->o:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
