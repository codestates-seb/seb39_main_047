import { useNavigate } from 'react-router-dom';
import * as S from './style';

interface Props {
  id: number;
}

export default function BoardBox({ id }: Props) {
  const navigate = useNavigate();

  return (
    <S.Container onClick={() => navigate(`${id}`)}>
      <S.Title>오늘 정말 날씨 좋음</S.Title>
      <S.ContentPreview>
        ㅁㄴㅇ럼냉랴ㅓ매냥러asdgasdgasdgasdfasdfasdfasdf
      </S.ContentPreview>
      <S.BoardInfo>
        <p>작성일자</p>
        <p>작성자</p>
      </S.BoardInfo>
    </S.Container>
  );
}
